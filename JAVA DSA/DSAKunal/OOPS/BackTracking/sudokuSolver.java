package DSAKunal.OOPS.BackTracking;

public class sudokuSolver {
    public static void main(String[] args) {
        
    }
    public static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for(int i = 0; i <n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                  row = i;
                  col = j;  
                }
            }
        }

    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        //check row
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == num){
                return false;
            }
        }

        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        
        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart; c++){
                if(board[r][c] == num){
                    return false;
                }    
            }
        }
    }
}
