package com.CSCI185;

import javax.sound.sampled.Port;
import java.util.Scanner;

public class DarkSoulsDeaths {
    public static void main(String[] args) {


        //asking for number of players
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many poor souls have played this game?");

        //saving number of players from user input into variable "NumberOfPoorSouls"
        int NumberOfPoorSouls = keyboard.nextInt();
        double sum = 0;
        //array
        int[] PoorSouls = new int[NumberOfPoorSouls];


        //loop to ask for number of deaths for each player
        for (int i = 0; i < PoorSouls.length; i++)
        {

            System.out.println("How many deaths does player " + i + " have?");
            int deaths = keyboard.nextInt();

            //number of deaths saved into certain index in array
            PoorSouls[i] = deaths;
            //adds all the deaths and saves it into sum
            sum += PoorSouls[i];

        }


        //finds average number of deaths for players
        double avg = PoorSouls.length / sum;
        System.out.println("The group average number of deaths for our poor souls is: " + avg);



        //loops to find who has highest and lowest deaths
        for(int i = 0; i < PoorSouls.length; i++)
        {

            for(int x = 0; x < PoorSouls.length-1-i; x++)
            {


                if(PoorSouls[x]>PoorSouls[x+1])
                {
                    int temp = PoorSouls[x];
                    PoorSouls[x] =PoorSouls[x+1];
                    PoorSouls[x+1] = temp;

                }
                else if(PoorSouls[x]<PoorSouls[x+1])
                {
                    int temp = PoorSouls[x];
                    PoorSouls[x] =PoorSouls[x+1];
                    PoorSouls[x+1] = temp;

                }
                else
                {
                    System.out.println("You all suck, get a refund!");


                }



            }

        }
        System.out.println("Player had the least deaths: "+PoorSouls[0]+ " Praise the sun!");
        System.out.println("The highest death count was: "+PoorSouls[PoorSouls.length-1]+" ");
    }



}