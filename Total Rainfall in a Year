/*
Asks the user and stores the total rainfall for each of the 12 months into an array of doubles
Program contains various static methods to perform various calculations and return statistics
*/

package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        double[] rainfall = new double[12]; //initializes array
        
        for (int i = 0; i < rainfall.length; i++)   //gets rainfall for each month
        {
            System.out.printf("Enter rainfall for %s: ", monthName(i));
            rainfall[i] = input.nextDouble();
            
            if(rainfall[i] < 0) //if value entered is negative
            {
                System.out.println("Rainfall cannot be negative");
                i--;    //decrement to redo current month
            }
        }
        
        //displaying values
        System.out.printf("The total rainfall for the year is %.2f\n", totalRainfall(rainfall));
        System.out.printf("The average rainfall for the year is %.2f\n", averageRainfall(rainfall));
        System.out.printf("The month with the highest rainfall is %s\n", monthName(mostRainMonth(rainfall)));
        System.out.printf("The month with the least rainfall is %s\n", monthName(leastRainMonth(rainfall)));
    }
    
    public static double totalRainfall(double[] arr)    //total rainfall for the year w/ array as parameter
    {
        double total = 0.0; //initialize
        
        for(int i = 0; i < arr.length; i++) //finding total rainfall
        {
            total += arr[i];    //add monthly rainfall month by month
        }
        return total;
    }
    
    public static double averageRainfall(double[] arr)  //average monthly rainfall w/ array as parameter
    {
        return totalRainfall(arr)/arr.length;   //use total rainfall for the year and divide by 12 (array length)
    }
    
    public static int mostRainMonth(double[] arr)    //returns number 0-11 refering to month of highest rainfall
    {
        //represents an index
        int maxMonth = 0;   //initialize maximum rainfall to first month
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > arr[maxMonth])  //compare array value at current iteration to value at maxMonth
            {
                maxMonth = i;   //changes index of month w/ max rainfall
            }
        }
        
        return maxMonth;
    }
    
    public static int leastRainMonth(double[] arr)  //returns number 0-11 refering to month of least rainfall
    {
        //represents an index
        int minMonth = 0;   //initializes min rainfall to first month
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < arr[minMonth])
            {
                minMonth = i;   //changes index of month w/ min rainfall
            }
        }
        
        return minMonth;
    }
    
    public static String monthName(int i)   //associates month names with numbers 0-11
    {
        String monthName = "";
        switch(i)
        {
            case 0: monthName = "January"; break;
            case 1: monthName = "February"; break;
            case 2: monthName = "March"; break;
            case 3: monthName = "April"; break;
            case 4: monthName = "May"; break;
            case 5: monthName = "June"; break;
            case 6: monthName = "July"; break;
            case 7: monthName = "August"; break;
            case 8: monthName = "September"; break;
            case 9: monthName = "October"; break;
            case 10: monthName = "November"; break;
            case 11: monthName = "December"; break;
        }
        return monthName;
    }
}
