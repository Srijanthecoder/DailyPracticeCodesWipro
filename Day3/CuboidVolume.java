// constructor overloading
// Create one default constructor to initialize the fields as default values to calculate volume of the cube and one parameterized constructor to pass parameters and initialize them accordingly. You can pass 3 integer parameters at runtime 
// (While using parameterized constructor, the program, should also display the output with the default constructor also)
// Sample output- with parametrized constructor
// Constructor without parameter
// Volume is 1000.0
// Constructor with parameter
// Volume is 192.0
package Day3;

import java.util.Scanner;

class CuboidVolume {

    int length, breadth, height;

    CuboidVolume() {
        length = 10;
        breadth = 10;
        height = 10;
        System.out.println("Constructor without parameter");
        double volume = length * breadth * height;
        System.out.println("Volume is " + volume);
    }

    CuboidVolume(int l, int b, int h) {
        this();
        length = l;
        breadth = b;
        height = h;
        System.out.println("Constructor with parameter");
        double volume = length * breadth * height;
        System.out.println("Volume is " + volume);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();
        int h = s.nextInt();

        CuboidVolume cuboid = new CuboidVolume(l, b, h);
    }
}
