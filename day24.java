/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Play With Average (100 Marks)
For this challenge, you need to take number of elements as input on one line and array elements as an input on another line. You need to find the average of even numbers, then the average of odd numbers and add them (round the averages to the nearest integers). 

Input Format
In this challenge, you will take number of elements as input on one line and array elements which are space separated as input on another line. 

Constraints
1 < N < 10^5
1 < A[i] < 10^5

Output Format
You will print the value after addition of the two averages to the stdout. 

Sample TestCase 1
Input
6
11 22 33 44 55 66
Output
77
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int arr[],i=0,n,j=0;
        float odd=0, even=0;
        n = sc.nextInt();

        arr = new int[n]; 

        if(n>1 && n<100000)
        {
            while(i<n)
            {
                arr[i] = sc.nextInt();
                i++;
            }

            for(i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    even = even + arr[i];
                    j++;
                }
                else
                odd = odd +arr[i];
            }

            even = (int)Math.round(even/j);
            odd = (int)Math.round(odd/(n-j));
            i = (int)(even+odd);
            System.out.print(i);
        }   

   }
}

