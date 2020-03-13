import java.util.Scanner;

import static java.lang.Math.round;

public class GalToLit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input gallons: ");

        double gallons = in.nextDouble();
        in.close();

        double liters;
        liters = gallons * 3.7854;

        liters = round(liters * 1000d) / 1000d;;
        System.out.println(gallons + " gallons = " + liters + " liters");
    }
}

