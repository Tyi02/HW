package com.CSCI185;

import java.io.*;

import java.util.Scanner;


public class wordSearch
{
    public static void main(String[] args)
    {
        String fileName = "words-1.txt";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type in a word to search for in this file.");
       String userWord = keyboard.next();



        //searches file
        try
        {
            Scanner dataFile = new Scanner(new File(fileName));

            //count used to keep track of number of words found
            int count = 0;

            //loops through each line of the file as long as file has a next line
            //prints the words that end with the word that user searches for
            //if word is found, adds it to the count
            while (dataFile.hasNextLine())
            {
               String data = dataFile.nextLine();
               if(data.endsWith(userWord))
               {
                   System.out.println(data);
                   count++;
               }

            }

            //if no words are found(count = 0) then it prints
            //word not found
            if(count == 0)
            {
                System.out.println("The word you are searching for was not found in this file.");
            }

        }

        //Exception if the file looking for was not found
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
            System.exit(0);
        }



    }
}

