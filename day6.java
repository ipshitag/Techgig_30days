/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner scan =  new Scanner(System.in);
   int a;
   int s=0;
   a = scan.nextInt();
   if(a>=1)
   {
      while(a!=0)
      {
         s++;
         a = a/10;
      }
      
   System.out.print(s);
   }
   else
   System.out.print("Wrong input");
   
   
   
   }
}
