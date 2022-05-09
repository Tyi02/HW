package com.CSCI185;

import java.util.Scanner;

public class handShakeProblem {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of people in this room.");
        int num = keyboard.nextInt();
        System.out.println(handshake(num));
    }

    public static int handshake(int n)
    {
        if (n<=1)
        {
            return 0;
        }

        else
        {

            return handshake(n-1) +(n-1);  //takes the previous number from user input and
                                             // does the handshake method for that number
                                             // then adds the current (number - 1) to the previous


        }

    }
}
