package com.CSCI185;

import java.util.Scanner;

public class Prime {
    //do loop do check if number is prime
    //use operator mod to see if it has a remainder

    public static boolean primeCheck(int n)
    {

        if( n ==1 )
        {
            System.out.println("1 is not a prime number");
            return false;
        }
        for(int i = 2; i<n; i++) // starts at 2 to check if it is divisible by the number
        {                        //if remainder given then it is prime.
                                // Basically divedes everything by 2 and loops it
            if(n % i ==0)
            {
                System.out.println(n+" is not a prime number");
                return false;
            }
        }
        System.out.println(n+" is a prime number");
        return true;
    }

    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose a number: ");
        number = keyboard.nextInt();
        primeCheck(number);
        
    }

}
