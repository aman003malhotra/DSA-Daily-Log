import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num = input.nextFloat();
        System.out.println(num);

        // type casting
        int num1 = (int) (67.56f);
        System.out.println(num1);

        //automatic type promotion in expression
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);

    }
}
