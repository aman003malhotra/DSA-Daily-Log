package CodingNinja.Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(4, 'a', 'b', 'c');
    }
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
        if(disks == 1){
            System.out.println((char)(source) +" " + (char)(destination));
            return;
        }
        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println((char)(source) +" " + (char)(destination));
        towerOfHanoi(disks-1, auxiliary,source,destination);
    }
}
