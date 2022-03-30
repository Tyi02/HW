package com.CSCI185;
/*
overload same class different parameters
override different class same parameters
 */
public class Person
{
    private String name;
    public Person ()
    {
        name = "No name yet";
    }


    public Person (String initialName)
    {
        System.out.println("Hi "+initialName+"!");
        System.out.println("--------------------");
        name = initialName;
    }


    public void setName (String newName)
    {
        name = newName;
    }


    public String getName ()
    {
        return name;
    }


    public void writeOutput ()
    {
        System.out.println("Info about this person: ");
        System.out.println ("Name: " + name);
    }


    public boolean hasSameName (Person otherPerson)
    {
        return this.name.equalsIgnoreCase (otherPerson.name);
    }
}