package CodingNinja.Recursion;

public class CheckNumberInArray {

    public static void main(String[] args) {
        int[] intTo = {9,8,9};
        checkNumber(intTo, 8);
    }
        public static boolean checkNumber(int input[], int x) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Return output and don't print it.
             * Taking input and printing output is handled automatically.
             */
            if (input[0] == x){
                return true;
            }
            int[] newArray = new int[input.length-1];
            for(int i = 1; i<input.length; i++){
                newArray[i-1] = input[i];
            }
            checkNumber(newArray, x);
            return false;
        }
    }
