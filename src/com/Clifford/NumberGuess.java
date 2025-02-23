package com.Clifford;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void generator() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();


        int randomNum = rand.nextInt(10) + 1;
        int num = 0;


        do {
            System.out.print("Guess any number from 1 to 10: ");
            num = scanner.nextInt();

            if (num > 10 || num < 1) {
                System.out.println("Invalid input! Enter a number from 1 to 10.");
            }

        } while (num > 10 || num < 1);

        if (num == randomNum)
            System.out.println("Congratulations! 🎉 You won!");
        else if (num > randomNum)
            System.out.println("You are wrong! 😢 The number is lower than " + num);
        else
            System.out.println("You are wrong! 😢 The number is greater than " + num);

        System.out.println("The correct number was " + randomNum);
        scanner.close();
    }

}