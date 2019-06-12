/* Read input from STDIN. Print your output to STDOUT*/

/*For this challenge, you need to take 2 matrices as an input from the stdin , add them and print the resultant matrix to the stdout. 

Input Format
Two matrices to be taken as an input. 
For each matrix, on first line you need to tell that how many rows and columns your matrix need to have and these values should be separated by space. 
Then after that, each line will represent will represent each row and you need to enter numbers which each rows should have separated by a space. 

Constraints
1 <  (n,m) < 100
1 <  (p,q) < 100

Output Format
Print the resultant matrix to the stdout where each each line should represent 
Note : Please do not include space after the numbers which are in the last column as it will affect your submission and you will not get marks. 
each row and values in the row should be separated by a space. 

Sample TestCase 1
Input
3 3
1 2 3
4 5 6
7 8 9
3 3
2 3 4
5 6 7
7 8 9
Output
3 5 7 

9 11 13 

14 16 18*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int r1,c1,r2,c2;
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

   r2 = sc.nextInt();
   c2 = sc.nextInt();

   int m2[][]; 
   m2 = new int [r2][c2];
   if((r2>=1 && r2<=100) && (c2>= 1 && c2<=100))
   {
      
      for(i=0;i<r2;i++)
      {
         for(j=0;j<c2;j++)
         m2[i][j] = sc.nextInt();
      }
   }
   else
   System.out.print("Wrong input");   

   if(r1==r2 && c1==c2)
   {
      for(i=0;i<r2;i++)
      {
         for(j=0;j<c2;j++)
         m2[i][j] += m1[i][j];
      }
   }
   else
   System.out.print("Wrong Input");

   for(i=0;i<r2;i++)
      {
         for(j=0;j<c2;j++)
         {
         System.out.print(m2[i][j]);
         if(j!=(c2-1))
         System.out.print(" ");
         }
         
         if(i!=(r2-1))
         System.out.print('\n');
      } 


   }
}
