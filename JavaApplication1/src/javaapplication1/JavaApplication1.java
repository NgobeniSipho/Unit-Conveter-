/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Capaciti
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Select the unit you want to convert from:");
            System.out.println("1. Feet");
            System.out.println("2. Pounds");
            System.out.println("3. Fahrenheit");
            int fromUnit = scanner.nextInt();

            // System.out.println("Select the unit you want to convert to:");
            // System.out.println("1. Meters");
            // System.out.println("2. Kilograms");
            // System.out.println("3. Celsius");
            int toUnit = 0;
            double quantity = 0.0;

            switch (fromUnit) {
                case 1:// feet
                    toUnit = 1;
                    System.out.println("Enter the Number of feets to convert:");
                    quantity = scanner.nextDouble();
                    break;
                case 2:
                    toUnit = 2;
                    System.out.println("Enter the Number of Pounds to convert:");
                    quantity = scanner.nextDouble();
                    break;
                case 3:
                    toUnit = 3;
                    System.out.println("Enter the Number of Fahrenheit to convert:");
                    quantity = scanner.nextDouble();
                    break;
            }

            double result = 0;
            System.out.println("");
            switch (fromUnit) {
                case 1: // Feet
                    if (toUnit == 1) { // to Meters
                        result = feetToMeters(quantity);
                        System.out.println(quantity + " Feet to Meters is : " + result + "m");
                    } else {
                        System.out.println("Invalid conversion.");
                        return;
                    }
                    break;
                case 2: // Pounds
                    if (toUnit == 2) { // to Kilograms
                        result = poundsToKilograms(quantity);
                        System.out.println(quantity + " Pounds to Kilograms is : " + result + "Km");
                    } else {
                        System.out.println("Invalid conversion.");
                        return;
                    }
                    break;
                case 3: // Fahrenheit
                    if (toUnit == 3) { // to Celsius
                        result = fahrenheitToCelsius(quantity);
                        System.out.println(quantity + " Fahrenheit to Celsius is : " + result + "\u00B0C");
                    } else {
                        System.out.println("Invalid conversion.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid unit selection.");
                    return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a correct input and try again.");
            System.out.println("Ensure the input is a number.");
        } catch (Exception e) {
            System.out.println("Something went wrong an error occured.");
        }

        // System.out.printf("Converted quantity: %.2f\n", result);
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
