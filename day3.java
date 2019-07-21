/* Read input from STDIN. Print your output to STDOUT
Play with operators (100 Marks)
For this challenge, you will be given the values of principal, interest and year. You need to calculate the simple interest, round it to the nearest integer and print it. 

Input Format
There will be 3 lines of numeric input - 
'a' : principal which is of type double. 
'b' : interest which is of type integer. 
'c' : year which is again of type integer. 

Constraints
1 < = (a,b,c) < = 1000

Output Format
Just print the simple interest value after performing the calculation using the formula to the stdout. The result should be an integer. 

Sample TestCase 1
Input
1000
4
2
Output
80*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner scan = new Scanner(System.in);
   double a; //principal
   int b; //rate
   int c;//year

   a = scan.nextDouble();
   b = scan.nextInt();
   c = scan.nextInt();

   System.out.print((int)(a*b*c)/100);
   

   }
}
