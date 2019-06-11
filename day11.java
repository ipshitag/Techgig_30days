/* Read input from STDIN. Print your output to STDOUT*/
/*For this challenge, you need to take a string as an input from the stdin, count the number of uppercase and lowercase letters and print them to the stdout. 

Input Format
A single line of string to be taken as an input and store it in a variable of your choice. 

Constraints
1 < = |s| < = 100000 

Output Format
print the number of uppercase letters on one line and number of lowercase letters on another side. 

Sample TestCase 1
Input
I Am Awesome
Output
3 

7
Explanation
For the above string which is taken as input, it has 3 uppercase letters which is displayed on one line and 7 lowercase letters which is displayed on another line. */


import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here

   Scanner sc = new Scanner(System.in);
   String str;
   str = sc.nextLine();
   int up = 0, lw = 0,i=0;

   if(str.length() <= 100000)
   {

      while (i < str.length())
      {
      if((int)(str.charAt(i))>=97 && (int)(str.charAt(i))<=122)
      lw++;

      else if((int)(str.charAt(i))>=65 && (int)(str.charAt(i))<=90)
      up++;

      i++;
      }

      System.out.println(up);
      System.out.print(lw);
   }
  else
  System.out.print("Wrong Input");
   }
} 
