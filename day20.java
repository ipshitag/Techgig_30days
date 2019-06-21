/* Read input from STDIN. Print your output to STDOUT*/
/*You need to print the following pattern 
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Input Format
NA

Constraints
NA

Output Format
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
Sample TestCase 1
Input

Output
* * * * * 

* * * * * 

* * * * * 

* * * * * 

* * * * **/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++)
		{
		System.out.print("*");
		if(j!=5)
		System.out.print(" ");
		}
		if(i!=5)
		System.out.print("\n");
	}

   }
}
