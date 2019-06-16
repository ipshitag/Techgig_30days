/* Read input from STDIN. Print your output to STDOUT*/
/*For this challenge, you need to take input of two numbers , calculate their greatest common divisor (GCD) and print it to the stdout. 

Input Format
You need to take two integers as an input which are separated by a single space. 

Constraints
1 < (a,b) < 10^5

Output Format
Print the single integer result to the stdout. 

Sample TestCase 1
Input
81 81
Output
81*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   int n1, n2, gcd = 1;
   Scanner sc = new Scanner(System.in);
   n1 = sc.nextInt();
   n2 = sc.nextInt();
        if((n1<=100000 && n1>1) && (n2<=100000 && n2>1))
        {
         for(int i = 1; i <= n1 && i <= n2; ++i)
         {
               // Checks if i is factor of both integers
               if(n1 % i==0 && n2 % i==0)
                   gcd = i;
         }
        } 

        System.out.print(gcd);


   }
}
