/*
Reads in 10 numbers and displays the number of distinct numbers and the distinct numbers in their input order 
and separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once).
*/

package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        final int size = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        
        int[] distinct = new int[size]; //holds distinct numbers
        int num;    //the current number being tested if distinct
        int count = 0;  //keeps track of # of distinct numbers
        
        for(int i = 0; i < size; i++)   //inputs numbers into array
        {
            num = input.nextInt();
            
            if(distinctNum(num, distinct))
            {
                count++;
                distinct[count-1] = num;    //count is total #, count-1 is index
            }
        }
        
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The number of distinct numbers are: ");
        for(int i = 0; i < count; i++)  //displays numbers in array that are distinct
        {
            System.out.print(distinct[i] + " ");
        }
    }
    
    public static boolean distinctNum(int num, int[] arr)   //tests if number is distinct
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(num == arr[i])   //if number is a duplicate
                return false;
        }
        return true;    //if number does not appear
    }
}
