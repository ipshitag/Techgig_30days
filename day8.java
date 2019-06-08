/* Read input from STDIN. Print your output to STDOUT*/
/*For this challenge, you need to take an integer input and store it in a variable of your choice and checks whether this number is an Armstrong number or not. If yes print 'True' else print 'False'. 

Input Format
A single integer value to be taken as input from stdin and stored it in a variable. 

Constraints
1 < = n < = 18

Output Format
print 'True' if your number is Armstrong otherwise print 'False' to the stdout. 

Sample TestCase 1
Input
370
Output
True
Explanation
It is a armstrong Number as 3^3 + 7^3 + 0^3 = 370. */

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int a,k;
   a = sc.nextInt();
   k=a;
   int s=0,t;
   if(a>=1)
   {
      while(a!=0)
      {
        s = s + (a%10)*(a%10)*(a%10);
        a = a/10;
      }

      if(s == k)
      System.out.print("True");
      else
      System.out.print("False");
   }

   }
}
