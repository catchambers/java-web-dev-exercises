package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");

        String radiusInput = input.nextLine();
        while (!isValidInput(radiusInput)) {
            System.out.println("Please only enter a positive number!");
            radiusInput = input.nextLine();
            //String stringFormatterMessage = String.format("The area of a circle of radius %s is: %s", radius, area);
            //most efficient, can do many more operations per minute

        }
        Double radius = Double.parseDouble(radiusInput);
        Double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }


    private static boolean isValidInput(String input) {
        //check if its an empty string
        if (input.equals("")){
            return false;
        }
        //check if input contains non numeric characters
        try {
            Double.parseDouble(input);
        } catch (Exception e) {
            return false;
        }

        //check not negative
        if (Double.parseDouble(input) < 0) {
            return false;
        }
        return true;
    }

}
