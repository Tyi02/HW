package com.CSCI185;

import java.util.Scanner;

public class DarkSouls {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many players have played this game?");
        int players = keyboard.nextInt();
        int[] DeathCount = new int[players];
        int sum = 0;


        for (int i = 0; i < DeathCount.length; i++) {

            System.out.println("Enter amount of deaths for player " + i + ":");
            DeathCount[i] = keyboard.nextInt();

            sum += DeathCount[i];
        }
        double avg = DeathCount.length / sum;
        System.out.println("The group average number of deaths for our poor souls is: " + avg);



        //l
        int highest = DeathCount[0];
        int lowest = DeathCount[0];
        for (int i = 1; i < DeathCount.length; i++)//starts at 1 bc already knows 0 is checked as lowest and highest
        {
            if (DeathCount[i] > highest) {
                highest = DeathCount[i];
            }
            if (DeathCount[i] < lowest) {
                lowest = DeathCount[i];
            }
        }

        for (int i = 0; i < DeathCount.length; i++) {

            if (DeathCount[i] == highest) {
                System.out.println("You suck");
            } else if (DeathCount[i] == lowest) {
                System.out.println("Praise the sun!");
            } else {
                System.out.println("Mid");
            }

        }

    }
}
