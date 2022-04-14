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

    public static void printMenu() {
        System.out.println("Escolha uma opção: ");
        System.out.println("0) Sair");
        System.out.println("1) Cadastrar conta");
        System.out.println("2) Depositar");
        System.out.println("3) Sacar");
        System.out.println("4) Mostrar contas");
    }

}
