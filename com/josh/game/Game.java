package com.josh.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int N;
    static Scanner s_number = new Scanner(System.in);
    static Random rand = new Random();
    public static void played(){
        boolean hasGuessedCorrectly = false;
        int value = rand.nextInt(101);
        int attempts = 3;
        System.out.println("You have " + attempts + " attempts to find the number. Let's play!!!!");
        int i = 0 ;
        do {
            System.out.println("Enter a number between 1 and 100:");
            N = s_number.nextInt();
            if (N <= 0 || 100 <N) {
                System.out.println("Please enter a number between 1 and 100.");

            }else if(N == value) {
                System.out.println(" Congrats!!You win !!!!");
                System.out.println("The right number is: "+ value);
                hasGuessedCorrectly = true;

            }else {
                System.out.println("Sorry try again!!!!");
            }
            i++;
        }while (i < attempts && !hasGuessedCorrectly);

        if(i == attempts && !hasGuessedCorrectly){
            System.out.println("You've used all your attempts. The right number was: " + value);
        }

    s_number.close();
    }
    public static void main(String[] args){played();}
}