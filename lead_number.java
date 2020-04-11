package com.akshat.number_programs;

import java.io.*;
import java.util.Scanner;

public class lead_number {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();

        int sume=0 , sumo=0,rem;

        while (n>0) {
            rem=n%10;
            if (rem%2==0) {
                sume+=rem;
            }
            else {
                sumo+=rem;
            }
            n=n/10;
        }
        System.out.println("Sum of even digits : "+sume+"\n"+"Sum of odd digits: "+sumo);
    }
}
