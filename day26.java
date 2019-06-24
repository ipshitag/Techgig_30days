/* Read input from STDIN. Print your output to STDOUT*/
/*Biggest Digit In A Number (100 Marks)
For this challenge, you will take an integer input from stdin, store it in a variable, find the digits in a number and then print the biggest of them. 

Input Format
A single integer value to be taken as input from stdin and stored it in a variable of your choice. 

Constraints
1 < N < 10^9

Output Format
Print the biggest digit in a number. 

Sample TestCase 1
Input
345678
Output
8
Explanation
For the above number, firstly get the digits which is their in that number and then compare between them to get the largest digit. */



import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
    Scanner sc = new Scanner(System.in);
	int a,b=0;

	a = sc.nextInt();

	if(a>1 && a<1000000000)
	{
		b = a%10;
		while(a!=0)
		{
			if((a%10)>b)
			b = a%10;

			a = a/10;
		}
	}

	System.out.print(b);

      

         }  

   }   

     

