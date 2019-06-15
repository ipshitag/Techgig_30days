/* Read input from STDIN. Print your output to STDOUT*/
/*This program takes two integers from user ( base number and a exponent) and calculates the power. Instead of using loops to calculate power, this program uses recursion to calculate the power of a number. 

Input Format
For this challenge, you need to take 2 integer inputs from stdin which are separated by a single space. 

Constraints
1 < N < 50
0 <= P <= 12

Output Format
You will print the answer to the stdout. 

Sample TestCase 1
Input
4 3
Output
64
Explanation
4^3 = 4*4*4 = 64 */

import java.io.*;
import java.util.*;


public class CandidateCode 
{
   public static int recurse(int a , int b)
   {
      if(b==0)
      return 1;
      else
      return a * recurse(a,b-1);
   }

   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int a,b,s=0;
   a = sc.nextInt();
   b = sc.nextInt();
   
   if( (a>0 && a<50) && (b>=0 && b<=12) )
   {
      s = recurse(a,b);
   }
   System.out.print(s);

   }
}
