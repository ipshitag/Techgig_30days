/* Read input from STDIN. Print your output to STDOUT
Decide yourself with conditional statement (100 Marks)
For this challenge, you need to read a integer value(default name - age) from stdin, store it in a variable and then compare that value with the conditions given below - 
    - if age is less than 10, then print 'I am happy as having no responsibilities.' to the stdout. 
    - if age is equal to or greater than 10 but less than 18, then print 'I am still happy but starts feeling pressure of life.' to the stdout. 
    - if age is equal to or greater than 18, then print 'I am very much happy as i handled the pressure very well.' to the stdout.  

Input Format
A single line to be taken as input and save it into a variable of your choice(Default name - age). 

Constraints
1 < = age < = 100 

Output Format
Print the sentence according to the value of the integer which you had taken as an input. 

Sample TestCase 1
Input
8
Output
I am happy as having no responsibilities.*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

    /*- if age is less than 10, then print 'I am happy as having no responsibilities.' to the stdout. 
    - if age is equal to or greater than 10 but less than 18, then print 'I am still happy but starts feeling pressure of life.' to the stdout. 
    - if age is equal to or greater than 18, then print 'I am very much happy as i handled the pressure very well.' to the stdout.*/  
	Scanner scan = new Scanner(System.in);
   int age;
   age =  scan.nextInt();

   if (age<10)
   System.out.print("I am happy as having no responsibilities.");
   else if(age>=10 && age <18)
   System.out.print("I am still happy but starts feeling pressure of life.");
   else if(age>=18)
   System.out.print("I am very much happy as i handled the pressure very well.");

   }
}
