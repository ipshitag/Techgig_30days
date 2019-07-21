/* Read input from STDIN. Print your output to STDOUT
Loop your world (100 Marks)
For this challenge, you need to take an integer value as input from stdin, calculate its factorial and print the result to the stdout. 1 

Input Format
A single integer value to be taken as input from stdin and stored it in a variable of your choice. 

Constraints
1 < = n < = 15

Output Format
Print the value which you will get after calculating the factorial of the input. 

Sample TestCase 1
Input
5
Output
120*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here

   Scanner scan = new Scanner(System.in);
   int i,s=1,t;
   i = scan.nextInt();
   if(i>=1 && i<=15)
   {
     for(t=1;t<=i;t++)
      s = s*t;
   }
   else
   System.out.println("wrong input");

   System.out.print(s);

   }
}
