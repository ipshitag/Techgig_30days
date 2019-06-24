/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Compare two numbers (100 Marks)
For this challenge, you will take two integers input from stdin, sum the digits of a number and same is to be done with another number. Then compare the sum of the digits of two numbers and if one sum found to be greater then print that number to the stdout. If found both sum to be equal then print 'Equal' to the stdout. 

Input Format
Two integer values to be taken as input from stdin. 

Constraints
1 < (a,b) < 10^9

Output Format
Print the single number after comparison. If found equal, then print 'Equal' to the stdout. 

Sample TestCase 1
Input
345678 444444
Output
345678
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int a,b,asize=0,bsize=0,adup=0,bdup=0;

        a = sc.nextInt();
        b = sc.nextInt();

        adup = a;
        bdup = b;

        while(a!=0)
        {
            asize = asize + (a%10);
            a = a/10;
        }

        while(b!=0)
        {
            bsize = bsize + (a%10);
            b = b/10;
        }

        if(asize>bsize)
        System.out.print(adup);
        else if (asize<bsize)
        System.out.print(bdup);
        else
        System.out.print("Equal");

   }
}
