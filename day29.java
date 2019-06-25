/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here

        Scanner sc = new Scanner(System.in);
        int n,j,i;

        n = sc.nextInt();
        j = sc.nextInt();

        int arr[][]; 

        arr = new int [n][j];
  

        int d1 = 0, d2 = 0; 

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
  
        for (i = 0; i < n; i++) 
        { 
            for (j = 0; j < n; j++) 
            { 
            // finding sum of primary diagonal 
                if (i == j) 
                d1 += arr[i][j]; 
  
            // finding sum of secondary diagonal 
                if (i == n - j - 1) 
                d2 += arr[i][j]; 
            } 
        } 
  
    // Absolute difference of the sums 
    // across the diagonals 
    if(d1>d2)
    System.out.print(d1-d2);
    else if(d1<d2)
    System.out.print(d2-d1);
    else
    System.out.print("Equal");
    
   }
}
