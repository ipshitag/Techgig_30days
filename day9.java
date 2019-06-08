/* Read input from STDIN. Print your output to STDOUT*/
/*For this challenge, you will take an integer input and store it in a variable and checks whether the input number is a Narcissistic number or not. If it is, then print 'True' else print 'False'. 


Input Format
A single integer value to be taken as input from stdin and stored it in a variable of your choice. 

Constraints
1 < = n < = 18

Output Format
print 'True' if your number is Narcissistic otherwise print 'False' to the stdout. 

Sample TestCase 1
Input
1634
Output
True
Explanation
First of all, what is a Narcissistic Number? 
An n-digit number that is the sum of the nth powers of its digits is called an n-narcissistic number. 

For example, take the number 1634 

1634 = 1^4 + 6^4 + 3^4 + 4^4 
So, this is a Narcissistic Number. */


import java.lang.Math;
import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int a,b=0,k,s=0;
   a = sc.nextInt();
   k = a;
   if(a >= 1)
   {
      while(a!=0)
      {
      b++;
      a = a/10;
      }
      
      a = k;
      while(a!=0)
      {
          s = s + (int)(Math.pow((a%10), b) );
          a = a/10;
      }
      if(s==k)
      System.out.print("True");
      else
      System.out.print("False");
   }



   }
}
