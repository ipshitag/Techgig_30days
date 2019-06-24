/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Play with digits of a number (100 Marks)
For this challenge, you will take an integer input from stdin, store it in a variable, find the digits in that number, identify digits that are odd and add them, identify which digits are even and add them. Subtract the smaller with the larger one. 

Input Format
A single integer value to be taken as input from stdin and stored it in a variable of your choice. 

Constraints
1 < N < 10^9

Output Format
Print the single number after subtraction. 

Sample TestCase 1
Input
34567
Output
5
Explanation
For the above number, 3,5 and 7 are odd digits and their sum is 15. 4 and 6 are even digits and their sum is 10. Now, subtraction of 10 from 15 results 5 which is your answer. 
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int a,ev=0,od=0;

        a = sc.nextInt();

        if(a>1 && a<1000000000)
        {
            while(a!=0)
            {
                if((a%10)%2 == 0)
                ev = ev + (a%10);
                else
                od = od + (a%10);

                a = a/10;
            }

            if(ev>od)
            System.out.print(ev-od);
            else
            System.out.print(od-ev);
        }

   }
}
