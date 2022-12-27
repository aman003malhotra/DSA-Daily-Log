package DSAKunal.OOPS;

public class A {
    private int num;
    String name;
    int[] arr;

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    // getter method
    public int getNum(){
        return num;
    }
    // setter method
    public void setNum(int num){
        this.num = num;
    }


}
