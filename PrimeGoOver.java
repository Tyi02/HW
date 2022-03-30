package com.CSCI185;

import java.util.Scanner;

public class PrimeGoOver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("give a number");
        int num = keyboard.nextInt();
        //takes number inputed by user and puts it into "isPrime" method to check it
        if(isPrime(num))
        {
            System.out.println("It's prime");

        }
        else{
            System.out.println("It's not prime");
        }
    }
    public static boolean isPrime(int n)
    {
        boolean status = true;

        //loop to check for prime number
        for(int i = 2; i < n; i++) //start at 2 bc divides by 2 to check if it is prime
        {
            if(n % i ==0)
            {
                status = false;
                break;
            }
        }
        return status;
    }
}
