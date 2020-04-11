package com.akshat.number_programs;
//PROGRAM IS DEVELOPED BY AKSHAT DODHIYA
import java.text.DecimalFormat;
import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Principal amount");
        double p = sc.nextDouble();

        System.out.println("Enter the annual rate of interest");
        double r1 = sc.nextDouble();
        double r = r1/100;


        System.out.println("Enter the time period for which money is borrowed or invested(in Years only)");
        double t = sc.nextDouble();

        System.out.println("Enter the  number of times the interest is compounded " +
                "(in numbers only) per unit 't' (For example yearly(12) , " +
                "half-yearly(6) , quarterly(4)");
        double n = sc.nextDouble();


        double amount = p * Math.pow((1 + (r/n)),(n*t));
        double c_interest = amount - p;


     DecimalFormat f = new DecimalFormat("##.00");
//     Setting the pattern of two decimal place for the decimal number to be printed


        System.out.println("Your Compound Interest is "+  f.format(c_interest));
        System.out.println("Total Amount is "+f.format(amount));
//        f.format() is used to set the declared format to the variable in parentheses
    }
}
