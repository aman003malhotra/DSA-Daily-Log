package CodingNinja.TicTacToe;

import java.util.Scanner;

public class Implementation {
    private Player player1, player2;
    private Board board;

    public static void main(String[] args) {
        Implementation t = new Implementation();
        t.startGame();
    }

    public void startGame(){
        Scanner s = new Scanner(System.in);

        // take player input
        player1 = takePlayerInput(1);
        player2 = takePlayerInput(2);
        while(player1.getSymbol() == player2.getSymbol()){
            System.out.println("Symbol already taken!! Please enter the symbol again");
            player2.setSymbol(s.next().charAt(0));
        }
        // create the board
        board = new Board(player1.getSymbol(), player2.getSymbol());
        // play the game
        boolean player1Turn = true;
        int status = Board.INCOMPLETE;
        while(status == Board.INCOMPLETE || status == Board.INVALIDMOVE){
            if(player1Turn){
                System.out.println("Player 1's"+ player1.getName()+" Turn");
                System.out.println("Enter x: ");
                int x = s.nextInt();
                System.out.println("Enter y: ");
                int y = s.nextInt();
                status = board.move(player1.getSymbol(), x, y);
                if(status == Board.INVALIDMOVE){
                    System.out.println("Invalid move !! Please try again");
                    continue;
                }
            }else{
                System.out.println("Player 2's "+ player2.getName()+" Turn");
                System.out.println("Enter x: ");
                int x = s.nextInt();
                System.out.println("Enter y: ");
                int y = s.nextInt();
                status = board.move(player2.getSymbol(), x, y);
                if(status == Board.INVALIDMOVE){
                    System.out.println("Invalid move !! Please try again");
                    continue;
                }
            }
            player1Turn = !player1Turn;
            board.print();
        }
        if(status == Board.PLAYER1WINS){
            System.out.println("Player 1 Wins");
        }else if(status == Board.PLAYER2WINS ){
            System.out.println("Player 2 Wins");
        }else{
            System.out.println("It is a draw");
        }
    }

    private Player takePlayerInput(int num){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Player " + num + "name: ");
        String name = s.nextLine();
        System.out.println("Enter Player " + num + "symbol: ");
        char symbol = s.next().charAt(0);
        Player p = new Player(name, symbol);
        return p;
    }


}
