package ru.vsu.cs.sviridov_d_v;

import java.util.Scanner;

public class NumberConversionSystems {

    public static void convertInOtherSystems(int choice) {

        Scanner input = new Scanner(System.in);

        if (choice == 1) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            String binary = Integer.toBinaryString(number);
            System.out.println("Decimal to Binary: " + binary);
        }

        else if (choice == 2) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            String hexadecimal = Integer.toHexString(number);
            System.out.println("Decimal to Hexadecimal: " + hexadecimal);
        }

        else if (choice == 3 ) {
            System.out.println("Enter a number: ");
            String binary = input.next();
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Binary to decimal: " + decimal);
        }

        else if (choice == 4){
            System.out.println("Enter a number: ");
            String hex = input.next();
            int decimal = Integer.parseInt(hex, 16);
            System.out.println("Hexadecimal to Decimal: " + decimal);
        }

        else if (choice == 5) {
            System.out.println("Enter a number: ");
            String hex = input.next();
            int decimal = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Hexadecimal to Binary: " + binary);
        }

        else  {
            System.out.println("Enter a number: ");
            String binary = input.next();
            int decimal = Integer.parseInt(binary, 2);
            String hex = Integer.toHexString(decimal);
            System.out.println("Binary to Hexadecimal: " + hex);
        }
    }
}