/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class PaintCaclculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int convert = 350;
        System.out.println("Input a length for the room:");
        int length = input.nextInt();
        System.out.println("Input a width for the room:");
        int width = input.nextInt();
        int area = length*width;
        double paintAmt = (double)area/convert;
        int paint = (int)Math.ceil(paintAmt);
        String output = String.format("You will need to purchase %d gallons of paint to cover %d square feet",
                                        paint, area);
        System.out.println(output);

    }
}
