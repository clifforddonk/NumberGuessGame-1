package com.Clifford;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void generator() {
        Scanner scanner= new Scanner(System.in);
        Random rand= new Random();

       int randomNum=rand.nextInt(10);

        System.out.println("Guess any number from 1 to 10:");
        int num=scanner.nextInt();

        if (num==randomNum)
            System.out.println("Congratulation, You won");


    }
}
