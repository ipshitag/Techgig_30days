/* Read input from STDIN. Print your output to STDOUT*/

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
      int n,i,sum;
      n=sc.nextInt();
      int arr[];
      arr = new int [n];
      for(i=0;i<n;i++)
      {
         arr[i] = sc.nextInt();
      }

      sum = sc.nextInt();

      sort(arr,0,n-1);
      
      int l=0, r;
      r=n-1;

      while(l<r)
      {
         if((arr[l] + arr[r]) == sum)
         {
         System.out.print("True");
            break;
         }
         else if ((arr[l] + arr[r]) < sum)
         l++;
         else
         r--;
      }

      /*for(i=0;i<n;i++)
      System.out.print(arr[i]);*/


   }
}
