/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Exploring Data Types (100 Marks)
For this challenge, you need to read a line from stdin and check whether it is of type integer, float or string. 
If input is- 
    Integer print 'This input is of type Integer.' to the stdout 
    Float print 'This input is of type Float.' to the stdout 
    String print 'This input is of type string.' to the stdout 
    else print 'This is something else.' to the stdout. 

Input Format
A single line to be taken as input as save it to a variable(name of your choice). 

Constraints
1 < |s| < 10000

Output Format
Print the text according to the data type you get as an input. 

Sample TestCase 1
Input
-32767
Output
This input is of type Integer.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            System.out.print("This input is of type Integer.");
        }

        else if(sc.hasNextFloat())
        {
            System.out.print("This input is of type Float.");
        }
        else if (sc.hasNextLine())
        {
            System.out.print("This input is of type string.");
        }       
        else 
        {
            System.out.print("This is something else.");
        }
    }
}

   

