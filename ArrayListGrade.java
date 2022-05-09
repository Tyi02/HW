package com.CSCI185;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListGrade {
    public static void main(String[] args) {

        ArrayList<Integer> Grades = new ArrayList<Integer>();
        boolean done = false;
       double sum = 0;
       double total = 0;

        while (!done)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a grades." );
            int entry = Integer.parseInt(keyboard.nextLine());
            Grades.add(entry);

            System.out.println("Would you like to enter more grades \n" +
                    "Enter Yes to continue \n" +
                    "Enter -1 to end");
            String ans = keyboard.nextLine();

            if (ans.equalsIgnoreCase("-1"))
            {
                done = true;
            }


            sum += ((double) entry);


        }

        System.out.println("The list of grades contains:");


        for(int gradeList: Grades)
        {
            System.out.println(gradeList);
        }

        double avg = sum/(Grades.size());

        System.out.println("The average grade is: "+avg);
        Collections.sort(Grades);
        System.out.println("The lowest grade was: "+Grades.get(0));
        System.out.println("The highest grade was: " + Collections.max(Grades));

    }




}
