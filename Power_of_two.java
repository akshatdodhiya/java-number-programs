package com.akshat.number_programs;

import java.util.Scanner;

public class Power_of_two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to be checked for power of 2");
        int number = sc.nextInt(); //storing input of an integer through scanner class function

        int temp=0,flag=0,i;
        for (i=0;i<=number;i++) {
            temp = (int)Math.pow(2,i); //calculating and storing the value of 2 raised to i in temp variable

            if (temp==number) {
               flag = 1;
               break;
            }
            else
               flag = 0;
        }
        if (flag == 1) {
            System.out.println("Yes, the number "+number+" is a power of two");
            System.out.println("2 raised to "+i+" gives "+number);
        }

        else
            System.out.println("No, the number is not a power of two");
    }
}
