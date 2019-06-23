/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 For this challenge, you need to take number of elements as input on one line and array elements as an input on another line. You need to tell whether the numbers present in the array are consecutive or not. 

Input Format
In this challenge, you will take number of elements as input on one line and array elements which are space separated as input on another line. 

Constraints
1 < N < 10^5
1 < A[i] < 10^5

Output Format
If the array elements are consecutive, print 'True' else print 'False' to the stdout. 

Sample TestCase 1
Input
6
11 22 33 44 55 66
Output
False
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int arr[],i=0,j,l,k=0;

        l = sc.nextInt();
        arr = new int[l]; 
        
        if (l>1 && l<=100000)
        {
        for(i=0;i<l;i++)
        {
            arr[i] = sc.nextInt();
        }

        j=arr[0];

        if(arr[0]>arr[1])
        {
            for(i=1;i<l;i++)
            {
                if(arr[i] == (j-1) )
                {
                    j++;
                    continue;
                } 
                else
                    {
                     System.out.print("False");
                        break;
                    }    
            }
                
        } 

        
        else if(arr[0]<arr[1])
        {
            j = 0;
            for(k=1;k<l;k++)
            {
                if(arr[k] == arr[j]+1 )
                {
                    j++;
                    continue;
                }    
                else
                    {
                     System.out.print("False");
                        break;
                    }    
            }
        }

        if(i==l && k==l)
        System.out.print("True");   
        }    

   }
}
