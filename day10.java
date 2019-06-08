/* Read input from STDIN. Print your output to STDOUT*/
/*For this challenge, you need to take number of elements as input on one line and array elements as an input on another line and find the second largest array element and print that element to the stdout. 

Input Format
In this challenge, you will take number of elements as input on one line and array elements which are space separated as input on another line. 

Constraints
1 < = n < = 100000
1 < = a[i] < = 10^9

Output Format
You will print the second largest element to the stdout. 

Sample TestCase 1
Input
6
11 22 33 44 55 66
Output
55*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   int n,first,second;
   Scanner scan = new Scanner(System.in);
   n = scan.nextInt();
   int arr[];    
   arr = new int[n];
   int i;
   for(i=0;i<n;i++)
   {
      arr[i] = scan.nextInt();
   }
   first = arr[0];
   second = arr[0];
   for (i = 0; i < n ; i ++) 
    { 
        /* If current element is greater than first 
           then update both first and second variable*/

        if (arr[i] > first) 
        { 
            second = first; 
            first = arr[i]; 
        } 
  
        /* If arr[i] is in between first and  
           second then update second  */

        else if (arr[i] > second && arr[i] != first) 
            second = arr[i]; 
    } 

    System.out.print(second);

   }
}
