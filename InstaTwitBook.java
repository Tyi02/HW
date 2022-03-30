package com.CSCI185;

import java.util.Scanner;

public class InstaTwitBook {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name, image, text, date;
        System.out.println("Enter your username: ");
        name = keyboard.nextLine();
        System.out.println("Enter your image url ");
        image = keyboard.nextLine();
        System.out.println("Enter your post text: ");
        text = keyboard.nextLine();
        System.out.println("Enter date: ");
        date = keyboard.nextLine();

        Post p1 = new Post();
        p1.setPost(name, date, image, text);
        p1.writeOutput();

        Post p2 = new Post();
        p2.setPost(name, date, image, text);
        p2.writeOutput();

//        Post p1 = new Post();
//        p1.readInput();
//        p1.writeOutput();
//
//        Post p2 = new Post();
//        p2.readInput();
//        p2.writeOutput();

        if(p1.equals(p2))
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("They are not equal");
        }
    }
}
