package com.CSCI185;

import java.io.*;

import java.util.Scanner;

import static java.nio.file.Files.*;

public class FileIO {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a file to access.");
        String fileName = keyboard.next();



      File file = new File(fileName);

        boolean fileExists = false;

        fileExists = file.exists();

        //Checks if file exists
        if (fileExists) {
            System.out.println("The file exists.");
            System.out.println("Please respond with the following resposnes \n" +
                    " Yes\n" +
                    " No");
            System.out.println("Would you like to delete this file?");
            String userInput = keyboard.next();

            //deletes file
            if (userInput.equalsIgnoreCase("Yes"))
            {
                System.out.println("The file has been deleted.");
                file.delete();
                System.exit(0);
            }

            //asks user if they want to write to it
            else if(userInput.equalsIgnoreCase("No"))
            {
                System.out.println("Would you like to write to this "+fileName+"?");
                String userInputQuestion = keyboard.next();

                //asks what you would like to write in file and writes it
                if(userInputQuestion.equalsIgnoreCase("Yes"))
                {
                    PrintWriter outputStream = null;

                    try {
                        outputStream = new PrintWriter(new FileOutputStream(fileName));

                        System.out.println("What would you like to write in this file?");
                        String userFileInput = keyboard.next();

                        outputStream.println(userFileInput);
                        outputStream.close();
                        System.out.println("It has been written to the " + fileName + ".");

                    }
                    catch (FileNotFoundException e)
                    {
                        System.out.println("Error writing to file.");
                    }

                }

                //if they don't want to write to it
                //closes program
                else if(userInputQuestion.equalsIgnoreCase("No"))
                {
                    System.out.println("No changes have been made to this file");
                }
                else
                {
                    System.out.println("Error please type the correct response.");
                    System.exit(0);
                }
            }

            else
            {
                System.out.println("Error please type the correct response.");
                System.exit(0);
            }

        }

        //if File doesn't exist, then ends program
        else if(!fileExists)
        {
            System.out.println("File does not exist.");
            System.exit(0);
        }

    }


}
