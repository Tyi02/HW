package com.CSCI185;

import java.util.Scanner;

/***
 * @author Terry Yi
 */

public class Post {

    private String Username;
    private String PostDate;
    private String PostText;
    private String Image;



    //Mutator
    public void setUsername(String NewUsername)
    {
        Username = NewUsername;
    }
    public void setPostDate(String NewPostDate)
    {
        PostDate = NewPostDate;
    }
    public void setPostText(String NewPostText)
    {
        PostText = NewPostText;
    }
    public void setImage(String NewImage)
    {
        Image = NewImage;
    }

    //Accessor
    public String getUsername()
    {
        return Username;
    }
    public String getPostDate() {
        return PostDate;
    }
    public String getPostText() {
        return PostText;
    }
    public String getImage() {
        return Image;
    }

    //printing method
    public void writeOutput()
    {
        System.out.println("Username: "+Username);
        System.out.println("PostDate: "+PostDate);
        System.out.println("PostText "+PostText );
        System.out.println("Image type: "+Image);
    }

    public void setPost(String NewUsername, String NewPostDate,
                        String NewPostText, String NewImage)
    {
        Username = NewUsername;
        PostDate = NewPostDate;
        PostText = NewPostText;
        Image = NewImage;
    }

    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the Username?");
        Username = keyboard.nextLine();
        System.out.println("What is the PostDate?");
        PostDate = keyboard.nextLine();
        System.out.println("What would you like to write for the post?");
        PostText = keyboard.nextLine();
        System.out.println("WHat type of image is this?");
        Image = keyboard.nextLine();
    }

    public boolean equals(Post other)
    {
        return this.Username.equalsIgnoreCase(other.Username) && this.PostDate.equalsIgnoreCase(other.PostDate)
                && this.PostText.equalsIgnoreCase(other.PostText) && this.Image.equalsIgnoreCase(other.Image);
    }
}
