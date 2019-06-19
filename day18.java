/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.

Minimum effort - Maximum output (100 Marks)
For this challenge, Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e] such that sorting this subarray makes the whole array sorted. 

Input Format
On the first line, you need to take an integer input which will be the length of the array. Another line will have space separated integer values. 

Constraints
1 < n < 10^5
1 < A[i] < 10^5

Output Format
Space separated integer values present in the subarray. 

Sample TestCase 1
Input
13
1 2 4 7 10 11 7 12 3 7 16 18 19
Output
4 7 10 11 7 12 3 7

*/

import java.io.*;
import java.util.*;
public class CandidateCode 
{
     public static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 

        } 
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
    public static void sort(int arr[], int low, int high) 
    { 
       if (low < high) 
        { 
            int pi = partition(arr, low, high); 
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }

   public static void main(String args[] ) throws Exception {

      Scanner sc = new Scanner(System.in);
     
      int i,n,sum;
      n=sc.nextInt();
      
      //arr is original array, and d_arr is the duplicate array
      int arr[],d_arr[];
      
      arr = new int [n];
      d_arr = new int[n];
      
      for(i=0;i<n;i++)
      {
         arr[i] = sc.nextInt();
         d_arr[i] = arr[i];
      }
    
      sort(arr,0,n-1);
    
      int s1=0,s2=0;
    
      for(i=0;i<n;i++)
      {
          if(arr[i]!=d_arr[i])
          {
              s1=i;
              break;
          }
      }

      for(i=n-1;i>=0;i--)
      {
          if(arr[i]!=d_arr[i])
          {
              s2=i;
              break;
          }
      }

      for(i=s1;i<=s2;i++)
      {
          System.out.print(d_arr[i]);
          if(i!=(s2))
          System.out.print(" ");
      }

   }
}
