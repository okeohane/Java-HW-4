/*
Generates 100 random integers between 0 and 5 (inclusive) and displays the count for each number.
*/

package javaapplication4;
public class JavaApplication4 
{
    
    public static void main(String[] args) 
    {
        int[] randomInt = new int[100];
        
        //initializes counts of all numbers at 0
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        
        for(int i = 0; i < randomInt.length; i++)
        {
            randomInt[i] = (int)(Math.random() * 6);    //random ints [0, 6)
            
            //checks what number it was and adds to occurences of that number
            
            switch(randomInt[i])
            {
                case 0: count0++; break;
                case 1: count1++; break;
                case 2: count2++; break;
                case 3: count3++; break;
                case 4: count4++; break;
                case 5: count5++; break;
            }
        }
        
        //displays results
        System.out.println("Number of 0s: " + count0);
        System.out.println("Number of 1s: " + count1);
        System.out.println("Number of 2s: " + count2);
        System.out.println("Number of 3s: " + count3);
        System.out.println("Number of 4s: " + count4);
        System.out.println("Number of 5s: " + count5);
    }
}
