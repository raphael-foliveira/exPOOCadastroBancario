package com.main;

import java.util.Scanner;

public class Interface {

    static Scanner scanner;

    public static int getInt(String message) {
        scanner = new Scanner(System.in);
        System.out.print(message);
        int userInt = scanner.nextInt();
        return userInt;
    }

    public static String getString(String message) {
        scanner = new Scanner(System.in);
        System.out.print(message);
        String userString = scanner.nextLine();
        return userString;
    }

    public static double getDouble(String message) {
        scanner = new Scanner(System.in);
        System.out.print(message);
        double userDouble = scanner.nextDouble();
        return userDouble;
    }

}
