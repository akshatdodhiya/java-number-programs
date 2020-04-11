package com.akshat.number_programs;

//Note : Below program is done in two methods "combined". Replace the specific lines of the code with the comments.

import java.io.*;
import java.util.Scanner;

public class cyclo_number {
    public static void main(String[] args)//throws IOException
    {

        Scanner sc=new Scanner(System.in);
        //InputStreamReader isr=new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(isr);

        //System.out.println("Enter the number :");
        // int n = Integer.parseInt(br.readLine());
        int n = sc.nextInt();

        int rem ,rem1,rev=0,temp=n,n1=n;
        int div,cnt=-1;
        rem1 = n1 % 10;

        while(n>0) {
            /*rem=n%10;
            rev=rev*10+rem;*/
            cnt++;
            n = n / 10;
        }
        div = (int)Math.pow(10,cnt);
        int ans = temp / div;
        //int ans = rev % 10;
        if (rem1==ans)
        {
            System.out.println("The number is cyclo number.");//Printing output
        }
        else {
            System.out.println("The number is not cyclo number.");
        }
    }
}
