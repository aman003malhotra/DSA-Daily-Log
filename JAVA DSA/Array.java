import java.util.*;
import java.io.*;

public class Array {
    public static void main(String[] args) {
//        Store a roll number
        int a = 19;

//        Store 5 roll number
        //SYNTAX -->  datatype[] variable_name = new datatype[size]
        int[] rnos = new int[5];

        // directly
        int[] rnum = {1,2,244,560};

        int[] ros; // declaration of array ros is getting defined in the stack // happens at compile time
        ros = new int[5]; // initialization actually here object is being created // happens at run time
        // array objects are in heap
        // arrays are not necessarily in continuous memory
        // dynamic memory allocation
        // depends on JVM if it's continuous or not
        // new keyword is used to create an object


        System.out.println(ros[1]); // print 0

        String[] arr = new String[4];
        System.out.println(arr[0]); // print null

        // primitives are something that cannot be broken
        // non primitives can be broken

        // array of objects

        // ENHANCED FOR LOOP
        int[] arr1 = new int[5];
//        int[] arr1 = {2,4,6,7,8};
        for(int i=0; i<5; i++){
            arr1[i] = i;
        }
        for(int num : arr1){
            System.out.println(num + " ");
        }
//        System.out.println(arr1.toString(arr1));

        int[] intArr = new int[] { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(intArr));

//        ERROR index out of bound --> the

//        ARRAYS OF OBJECTS

        String[] str = new String[4];
        for (int i=0; i<str.length; i++){
            Scanner in = new Scanner(System.in);
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));
// array stores the reference to the objects and objects can be anywhere in the heap
    }
}


