/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Binary To Decimal (100 Marks)
You will be getting a binary number as an input and you need to convert it into a decimal number. 

Input Format
You will be taking a binary number as an input. 

Constraints
1 < N < 10^9

Output Format
Print the decimal number to the stdout. 

Sample TestCase 1
Input
110
Output
6
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int a,b=0,j=0;

        a = sc.nextInt();
        if(a>=1 && a<1000000000)
        {
            while(a!=0)
            {
            b = b + (int)Math.pow(2,(j)) * (a%10);
            j++;
            a=a/10;
            }
         System.out.print(b);
        }

   }
}
