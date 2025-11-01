// bicycle and mountain bike
// your task is to implement two classes as shown in the diagram
package Day4;

import java.util.Scanner;

public class Bicycle {

    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gear = sc.nextInt();
        int speed = sc.nextInt();
        int seatHeight = sc.nextInt();

        MountainBike mb = new MountainBike(gear, speed, seatHeight);
        System.out.println(mb.toString());
    }
}

class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
