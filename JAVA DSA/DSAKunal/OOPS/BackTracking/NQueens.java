package DSAKunal.OOPS.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        
    }

    public static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;
        //placing the queen
        for(int col = 0; col < board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        // check vertiacal row
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // check diagnol
        int maxLeft = Math.min(row, col);
        for(int i = 0; i<maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(row, board.length-col-1);
        for(int i = 1; i<=maxRight; i++){
            if(board[row-i][col+1]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element) {
                    System.out.println("Q ");
                }else{
                    System.out.println("X");  
                }
            }
            System.out.println();
        }
    }
}
