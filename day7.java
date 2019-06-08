/* Read input from STDIN. Print your output to STDOUT*/
/* For this challenge, you are given a range and you need to find how many prime numbers lying between the given range. 

Input Format
For this challenge, you need to take two integers on separate lines. These numbers defines the range. 

Constraints
1 < = ( a , b ) < = 100000

Output Format
output will be the single number which tells how many prime numbers are there between given range.

Sample TestCase 1
Input
1
20
Output
7
Explanation
There are 7 prime numbers which lies in the given range. 
They are 3, 5, 7, 11, 13, 17, 19 */


import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int a,b;  //range
   a = sc.nextInt();
   b = sc.nextInt();
   if (a==1)
   a = a+2;
   if(a==2)
   a = a+1;
   int t,s=0,i,k=0;
   if(a<b && a>=1)
   {
      for (t=a;t<=b;t++)
      {
         for(i=2;i<t;i++)
         {
            if(t%i == 0)
            {
            k=1;
            }
         
          }
       if ( k == 0)
       s = s+1;
       k=0;
      }
      System.out.print(s);
   }

   }
}
