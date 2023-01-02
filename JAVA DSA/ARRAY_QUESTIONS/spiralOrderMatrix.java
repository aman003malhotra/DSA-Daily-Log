package ARRAY_QUESTIONS;
import java.util.*;
public class spiralOrderMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> finalList = new ArrayList<Integer>(1);
        int maxRow = matrix.length-1;
        int maxCol = matrix[0].length-1;
        int minRow = 0;
        int minCol = 0;
        int tne = matrix.length * matrix[0].length;
        int cnt = 0;
        while(cnt < tne){
            for(int i = minCol; i<=maxCol; i++){
                finalList.add(matrix[minRow][i]);
                cnt++;
            }
            minRow++;
            for(int i = minRow; i<=maxRow; i++){
                finalList.add(matrix[i][maxCol]);
                cnt++;
            }
            maxCol--;
            for(int i = maxCol; i>=minCol; i--){
                finalList.add(matrix[maxRow][i]);
                cnt++;
            }
            maxRow--;
            for(int i = maxRow; i>minRow; i--){
                finalList.add(matrix[i][minCol]);
                cnt++;
            }
            minCol++;
        }
        return finalList;
    }
}
