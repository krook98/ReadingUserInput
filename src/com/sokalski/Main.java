package com.sokalski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int all = 0;
        int counter = 0;

        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number: " + order + ": ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                all += number;
                counter++;

            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + all);
        scanner.close();

    }
}
