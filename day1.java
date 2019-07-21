/* Read input from STDIN. Print your output to STDOUT
Hello TechGig (100 Marks)
For this code challenge, you need to read a line from stdin and store it to a variable, print 'Hello Techgig' and then on another line, print the variable's value. 
A single line to be taken as input and save it into a variable of your choice. 

Input Format
A single line to be taken as input and save it into a variable of your choice. 

Constraints
1 <  |s| < 10000

Output Format
Print 'Hello Techgig' and then content of the variable on another line. 

Sample TestCase 1
Input
I am coming back to the race.
Output
Hello Techgig 

I am coming back to the race.*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   String inpstr;
   Scanner Scan = new Scanner(System.in);
   inpstr = Scan.nextLine();
   Scan.close();
   System.out.println("Hello Techgig");
   System.out.print(inpstr);

   }
}
