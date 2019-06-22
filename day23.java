/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 For this challenge, you need to take number of elements as input on one line and array elements as an input on another line. You need to find the minimum number and maximum number from the array and multiply them. 

Input Format
In this challenge, you will take number of elements as input on one line and array elements which are space separated as input on another line. 

Constraints
1 < N < 10^5
1 < A[i] < 10^5

Output Format
You will print the value after multiplication to the stdout. 

Sample TestCase 1
Input
6
11 22 33 44 55 66
Output
726
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int arr[],i=0,max,min,n;
        n = sc.nextInt();
        arr = new int[n];   
        if(n>1 && n<100000)
        {
            while(i<n)
            {
                arr[i] = sc.nextInt();
                i++;
            }

            max = arr[0];
            min = arr[0];

            for(i=0;i<n;i++)
            {
                if(arr[i]>max)
                max = arr[i];
                else if(arr[i]<min)
                min = arr[i];
            }

            System.out.print(max*min);
        }    
        

   }
}
