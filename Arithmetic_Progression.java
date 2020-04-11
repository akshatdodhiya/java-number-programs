package com.akshat.number_programs;


import java.io.*;
import java.lang.*;

public class Arithmetic_Progression {
    public static void main(String[] args)throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        BufferedReader br2 = new BufferedReader(isr);//br2 is used because while executing the program, error of "empty string" is shown by the java compiler

        System.out.println("To Calculate Difference terms of Arithmetic Progression you choices are :\n First term = a \n Last term = l \n Number of terms = n \n Common Difference = d");
        //Showing the choices to the user
        System.out.println("\nEnter your choice");
        char ch = (char) br2.read();

        double ans = 0.0;
        int flag = 0;

        if (ch=='a'||ch=='A') {
            System.out.println("Enter the common difference");
            double d = Double.parseDouble(br.readLine());

            System.out.println("Enter total number of terms");
            int n = Integer.parseInt(br.readLine());

            System.out.println("Enter the last term");
            double l = Double.parseDouble(br.readLine());

            ans = l - (n-1)*d;//formula to find first term of AP
        }
        else if (ch=='l'|| ch=='L') {
            System.out.println("Enter the first term");
            double a = Double.parseDouble(br.readLine());

            System.out.println("Enter the common difference");
            double d = Double.parseDouble(br.readLine());

            System.out.println("Enter total number of terms");
            int n = Integer.parseInt(br.readLine());

            ans = a + (n-1)*d;//formula to find last term of AP
        }
        else if (ch=='d'||ch=='D') {
            System.out.println("Enter the first term");
            double a = Double.parseDouble(br.readLine());

            System.out.println("Enter total number of terms");
            int n = Integer.parseInt(br.readLine());

            System.out.println("Enter the last term");
            double l = Double.parseDouble(br.readLine());

            ans  = (l - a)/ (n-1.0);//formula to find common difference of an AP
        }
        else if (ch=='n'||ch=='N') {
            System.out.println("Enter the first term");
            double a = Double.parseDouble(br.readLine());

            System.out.println("Enter the common difference");
            double d = Double.parseDouble(br.readLine());

            System.out.println("Enter the last term");
            double l = Double.parseDouble(br.readLine());

            ans = ((l - a)/d) + 1;//formula to find number of terms in an AP
        }
        else {
            System.out.println("Invalid Choice : Please Enter a valid choice");
            flag = 1;//to prevent double output flag is used
        }
        if (flag==0) {
            System.out.println("Your Answer is "+(int)ans);//showing output in int data type
        }

    }
}
