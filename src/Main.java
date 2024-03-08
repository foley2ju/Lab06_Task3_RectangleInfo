import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        // Variables
        Scanner in = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        double perimeter = 0.0;
        double area = 0.0;
        double diagonal = 0.0;
        boolean done1 = false;
        boolean done2 = false;
        String trash = "";

        // Length
        do {
            System.out.println("Enter the length: ");
            if (in.hasNextDouble()) {
                // Success
                length = in.nextDouble();
                done1 = true;
            } else {
                // Fail
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number for the length.");
            }

        } while (!done1);

        // Width
        do {
            System.out.println("Enter the width: ");
            if (in.hasNextDouble()) {
                // Success
                width = in.nextDouble();
                done2 = true;
            } else {
                // Fail
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number for the width.");
            }

        } while (!done2);

        // Results

        perimeter = (width + width + length + length);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        area = length * width;
        System.out.println("The area of the rectangle is " + area);
        diagonal = sqrt((width * width) + (length * length));
        System.out.println("The diagonal length is " + diagonal);

    }
}