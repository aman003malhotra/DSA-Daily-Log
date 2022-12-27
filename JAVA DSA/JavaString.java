import java.util.ArrayList;
import java.util.Arrays;

public class JavaString {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6};
        int a = 10;
        String name = "Kunal Kushwaha";
        String name2 = "Kunal Kushwaha";

        System.out.println(name == name2);

        String a1 = new String("Kunal");
        String a2 = new String("Kunal");

        System.out.println(a1 == a2); // plays with memories  //.value().toString

        System.out.println(a1.equals(a2)); // plays with values
        System.out.println(a1.charAt(2)); // to get the character at a specific index
        float f = 453.127f;
        System.out.printf("Formatted Number %.2f",f);
        System.out.printf("\nPie %.3f", Math.PI);
//        %c - Character
//        %d - Decimal number (base 10)
//        %e - Exponential floating-point number
//        %f - floating-point number
//        %i - Integer (base 10)
//        %o - Octal Number (base 10)
//        %s - String
//        %u - Unsigned decimal(integer) number
//        %x - Hexadecimal number (base 10)
//        %t - Date/time
//        %n - Newline

        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);

        // saves memory
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        String newName = "Kunal Kushwaha";
        System.out.println(Arrays.toString(newName.toCharArray()));
        System.out.println(newName.toLowerCase()); // new object is created
        System.out.println(name.indexOf('a'));
    }
}
