package ru.vsu.cs.sviridov_d_v;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        System.out.println("Number Conversion Systems \n");

        System.out.println("1.\t Decimal to Binary");
        System.out.println("2.\t Decimal to Hexadecimal");
        System.out.println("3.\t Binary to Decimal");
        System.out.println("4.\t Hexadecimal to Decimal");
        System.out.println("5.\t Hexadecimal to Binary");
        System.out.println("6.\t Binary to Hexadecimal \n");

        int choice = readNumber();
        NumberConversionSystems.convertInOtherSystems(choice);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        boolean invalidEnter = true;
        int choice;
        do {
            System.out.println("Enter your choice?");
            choice = input.nextInt();
            if (( choice < 1 ) || (choice > 6)) {
                System.out.println("Invalid choice. Please choose a number between 1 and 6.");
            } else {
                invalidEnter = false;
            }
        }
        while (invalidEnter);
        return choice;
    }
}
