
//Inheritance oops
import java.util.Scanner;

class Student {
    int roll;
    String name;
    Scanner s;

    public Student(Scanner s) {
        this.s = s;
    }

    public void setData() {
        System.out.print("Enter the roll no:");
        roll = s.nextInt();

        System.out.print("Enter Name:");
        name = s.next();
    }

    public void display() {
        System.out.println("roll:" + roll);
        System.out.println("Name:" + name);
    }
}

class Marks extends Student {
    int m1, m2, m3, sum;
    Scanner s;

    public Marks(Scanner s) {
        super(s);
        this.s = s;
    }

    public void marks() {
        System.out.println("Enter the three marks:");
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();

    }

    public void display() {
        super.display();
        System.out.println("total marks=" + (m1 + m2 + m3));

    }
}

class Hello {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        Marks obj = new Marks(scr);
        obj.setData();
        obj.marks();
        obj.display();
    }}






===========================================================================================================
    





Single inheritance oops

    class Bicycle {
        // the Bicycle class has two fields
        public int gear;
        public int speed;
        public int dec;
        public int inc;

        // the Bicycle class has one constructor
        public Bicycle(int gear, int speed, int dec, int inc) {
            this.gear = gear;
            this.speed = speed;
            this.dec = dec;
            this.inc = inc;
        }

        // the Bicycle class has three methods
        public int applyBrake(int dec) {
            System.out.println("Speed of the bike is:");
            return speed -= dec;
        }

        public int speedUp(int inc) {
            System.out.println("Speed of the bike");
            return speed += inc;
        }

        // toString() method to print info of Bicycle
        public String toString() {
            return ("No of gears are " + gear + "\n"
                    + "speed of bicycle is " + speed + "\n" + "bracke " + dec + "\n" + "UP " +
                    inc);
        }
    }

    // derived class
    class MountainBike extends Bicycle {

        // the MountainBike subclass adds one more field
        public int seatHeight;

        // the MountainBike subclass has one constructor
        public MountainBike(int gear, int speed,
                int startHeight, int dec, int inc) {
            // invoking base-class(Bicycle) constructor
            super(gear, speed, dec, inc);
            seatHeight = startHeight;
        }

        // the MountainBike subclass adds one more method
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        // overriding toString() method
        // of Bicycle to print more info
        @Override
        public String toString() {
            return (super.toString() + "\nseat height is "
                    + seatHeight);
        }
    }

    // driver class
    class Hello {
        public static void main(String args[]) {

            MountainBike mb = new MountainBike(3, 100, 25, 50, 20);
            System.out.println(mb.toString());
            System.out.println(mb.applyBrake(50));
            System.out.println(mb.speedUp(20));
        }
    }


==============================================================================
    




Multipe inheritance oops

    interface Math1 {
        public default int add(int n1, int n2) {
            return n1 + n2;
        }

        public default int sub(int n1, int n2) {
            return n1 - n2;
        }
    }

    interface Math2 {
        public default int mult(int n1, int n2) {
            return n1 * n2;
        }

        public default int div(int n1, int n2) {
            return n1 / n2;
        }

        public default int mod(int n1, int n2) {
            return n1 % n2;
        }
    }

    interface Math3 extends Math1, Math2 {

        public default void Good() {
            System.out.println("Program successfully run!");
        }
    }

    class child implements Math3 {
        public void ok() {
            System.out.println("Ok");
        }
    }

class Hello {
public static void main(String[] args) {
child ma = new child();
int r1 = ma.add(5, 2);
int r2 = ma.sub(5, 2);
int r3 = ma.mult(5, 2);
int r4 = ma.div(10, 2);
int r5 = ma.mod(10, 2);
System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
}
}