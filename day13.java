/* Read input from STDIN. Print your output to STDOUT*/
/*For this challenge, you need to take a matrix as an input from the stdin , transpose it and print the resultant matrix to the stdout. 

Input Format
A matrix is to be taken as input from stdin. On first line you need to tell that how many rows and columns your matrix need to have and these values should be separated by space. Below lines will represent the elements of the matrix where each line will represent the row of the matrix.

Constraints
1 < (n,m) < 100

Output Format
Print the resultant matrix to the stdout where each line should represent each row and values in the row should be separated by a space. 

Sample TestCase 1
Input
3 3
1 2 3
4 5 6
7 8 9
Output
1 4 7 

2 5 8 

3 6 9*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);

   int r1,c1;
   int i,j;
  
   r1 = sc.nextInt();
   c1 = sc.nextInt();

   int m1[][]; 
   m1 = new int [r1][c1];

   if((r1>1&&r1<100) && (c1>1&&c1<100))
   {
      for(i=0;i<r1;i++)
      {
         for(j=0;j<c1;j++)
         m1[i][j] = sc.nextInt();
      }
   }
   else
   System.out.print("Wrong input");
    
     for(j=0;j<c1;j++)
      {

         for(i=0;i<r1;i++)
         {
         System.out.print(m1[i][j]);
         if(i!=(r1-1))
         System.out.print(" ");
         }

           if(j!=(c1-1))
          System.out.print('\n');

      } 

   }
}
