package CodingNinja.ExceptionHandling;

public class ExceptionDemo {
    public static int divide(int a, int b) throws DivideByZeroException {
        if(b==0){
            throw new DivideByZeroException();
        }
        return a/b;
    }


    public static void main(String[] args) throws DivideByZeroException {
        String s = null;
//        System.out.println(s.length());
//        System.out.println(4/0);
        System.out.println("Main");
        try{
            divide(10,2);
        }catch(DivideByZeroException e){
            System.out.println("Divide by zero exception");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("generic exception");
        }
        System.out.println("main");
    }
}
