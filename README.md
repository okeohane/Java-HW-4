# Java-HW-4
Java 360 Coding Assignment #4

1.	Write a program that asks the user and stores the total rainfall for each of the 12 months into an array of doubles. The program should have the following static methods that return the following: 
•	the total rainfall for the year 
•	the average monthly rainfall 
•	the month with the most rain, in case of multiple months, just return any one 
•	the month with the least rain, in case of multiple months, just return any one
•	a method that takes a number between 0-11 and returns corresponding month name. 0 corresponds to January, 1 corresponds to February and so on.
Input Validation: Do not accept negative numbers for monthly rainfall figures.

2.	Write a program that randomly generates an array of 100,000 integers in the range 1-100,000. Now generate a key in the same range. 
Write a method linearSearch that takes two parameters, an array and a key, and performs a linear search of the key in the array and returns the corresponding index. Do not use built-in linear search method.
Now write a method binarySearch that performs a binary search for a key in the array and returns the corresponding index. Do not use built-in binary search method.
Estimate the execution time of invoking the linearSearch method and estimate the execution time of invoking the binarySearch method. You can use the following code template to obtain the execution time: 
long startTime = System. currentTimeMillis (); 
perform the task; 
long endTime = System. currentTimeMillis (); 
long executionTime = endTime − startTime;

3.	 Write a program that reads in 10 numbers and displays the number of distinct numbers and the distinct numbers in their input order and separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once).
Here is the sample run of the program: 
Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2 
The number of distinct numbers is 6 
The distinct numbers are: 1 2 3 6 4 5

4.	 Write a program that generates 100 random integers between 0 and 5 (inclusive) and displays the count for each number. 
