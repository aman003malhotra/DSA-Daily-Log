package CodingNinja.Inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        CodingNinja.Inheritance.Vehicle v = new CodingNinja.Inheritance.Vehicle();
        v.color = "Red";
        v.print();

        CodingNinja.Inheritance.Car c = new CodingNinja.Inheritance.Car();
        c.color = "Black";
        c.maxSpeed = 100;
        c.numDoors = 4;

        c.print();
    }
}
