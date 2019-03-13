/*
Randomly generates an array of 100,000 integers in the range 1-100,000 and generate a key in the same range.
Uses linear and binary search methods to find key.
*/

package javaapplication2;
import java.util.Arrays;
public class JavaApplication2 
{

    public static void main(String[] args) 
    {
        int[] arr = new int[100000];
        int key;
        //insert into array random values from 1-100,000
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)((Math.random() * 100000) + 1);   //range from [1, 100001)
        }
        
        key = (int)((Math.random() * 100000) + 1);  //generates a random key in same range
        
        System.out.printf("Using linear search the number %d was found at index %d.\n", key, linearSearch(arr, key));
        System.out.printf("Using binary search the number %d was found at index %d.\n", key, binarySearch(arr, key));
    }
    
    public static int linearSearch(int[] arr, int key)
    {
        //start execution time
        long startTime = System.currentTimeMillis(); 
        int index = -1; //will change if key is found
        
        for(int i = 0; i < arr.length - 1; i++) //runs through array and breaks loop when/if key is found
        {
            if(arr[i] == key)
            {
                index = i;
                break;
            }
        }
        
        //end execution time
        long endTime = System.currentTimeMillis(); 
        long executionTime = endTime - startTime;
        
        System.out.println("Execution time of Linear Search: " + executionTime + "ms.");
        return index;   //return index of key (-1 if not found)
    }
    
    public static int binarySearch(int[] arr, int key)
    {
        //start execution time
        long startTime = System.currentTimeMillis(); 
        int index = -1;
        
        Arrays.sort(arr);   //sorts array in ascending order
        
        //initialize high and low
        int low = 0;    
        int high = arr.length - 1;  //index of last number
        
        for(int i = low; i < high; i++)
        {
            int mid = (high + low) / 2; //middle index
            
            if(arr[mid] == key) //if number at middle index is the key
            {
                index = mid;
                break;
            }
            else if(arr[mid] > key) //if middle number is bigger than key
                high = mid-1;   //set upper bound to mid
            else    //if middle number is less than key
                low = mid+1;    //set lower bound to mid
        }
        
        //end execution time
        long endTime = System.currentTimeMillis(); 
        long executionTime = endTime - startTime;
        
        System.out.println("Execution time of Binary Search: " + executionTime + "ms.");
        return index;   //return index of key (-1 if not found)
    }
}
