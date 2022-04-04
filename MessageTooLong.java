package com.CSCI185;

import java.util.Scanner;

public class MessageTooLong extends Exception{

    public MessageTooLong()
    {
        super("Message is too long");
    }

    public MessageTooLong(String Message)
    {
        super(Message);
    }

    public static void main(String[] args) {
        try
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter a message: ");
            String Message = keyboard.nextLine();
                throw new Exception("Exception thrown: Message too long");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }

