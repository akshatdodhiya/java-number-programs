/* This program calculates the total number of days completed after new year
   Example: 1) input = 05/01/2020
    then, output = 5 days
    2) input = 03/03/1998
    then, output = 62 days */

// Youtube Video Code Explanation and Output Demostration:
// https://www.youtube.com/watch?v=XjL07o6qdhI


import java.io.*;
class total_dates_calculation
{
    static int month(String m,String y)
    {
        int total_days=0;  // Declaring the total number of days before beginning the calculations
        int mm = Integer.parseInt(m);  // parsing the string into 'int' data type for calculations
        int yy = Integer.parseInt(y);  // parsing the string into 'int' data type for calculations
        mm-=1; // Decrementing the number of month so as to get correct calculation  

        while(mm>0)
        {
            if(mm==1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)
                total_days+=31;  // Adding number of days for month having total 31 days
            else if(mm==2)
            {
                if(yy%4==0)
                    total_days+=29;  // Adding days of february for leap year
                else
                    total_days+=28;  // Adding days of february for non-leap year
            }
            else
                total_days+=30;  // Adding the number of days for month having 30 days             
            mm--;  // Reducing the month to calculate more number of days
        }
        return total_days;  // Returning the days completed before the same month
    }

    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the date/month/year (In the same format!)");
        String str=br.readLine(); // Taking the input of the user in string format

        String[] arr = str.split("/", -2);  // Splitting the string by "/" and storing it into an array

        int op = month(arr[1], arr[2]);  // Calling the method and giving input of month & Year for days calculation

        int output_days = op+Integer.parseInt(arr[0]);  // Storing total number of days by adding the days completed in the same month

        System.out.println("----------\nThe total number of days completed are : "+output_days+"\n----------");  // Printing the output
    }
}
