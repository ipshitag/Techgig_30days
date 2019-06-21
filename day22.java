/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 For this challenge, you need to take number of elements as input on one line and array elements as an input on another line. You need to find the numbers that are present at odd index, add them. find the numbers that are present at even index, add them and then subtract the smallest of the two values from the lager one. 
Note: 
Array indexes always starts from 0. 

Input Format
In this challenge, you will take number of elements as input on one line and array elements which are space separated as input on another line. 

Constraints
1 <  N < 10^5
1 < A[i] < 10^5

Output Format
You will print the value after subtraction to the stdout.

Sample TestCase 1
Input
6
11 22 33 44 55 66
Output
33
Explanation
Of all the given elements which are in the array, identify numbers that are present at odd index and add them. Identify even index numbers and add them. Subtract the smaller vale from the larger one.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int arr[],l,odd=0,even=0,i=0;
        l = sc.nextInt();
        arr = new int[l];

        while(i<l)
        {
            arr[i] = sc.nextInt();
            i++;
        }

        for(i=0;i<l;i++)
        {
            if(i%2==0)
            even = even + arr[i];
            else
            odd = odd + arr[i];
        }

        if(odd>even)
        System.out.print(odd-even);
        else
        System.out.print(even-odd);

   }
}
