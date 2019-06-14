/* Read input from STDIN. Print your output to STDOUT*/
/*You need to input N words one on each line and output should be lexicographically sorted i.e the words which comes as a output should be lexicographically sorted 

Input Format
You will be taking an integer N from STDIN. 
Following N lines contains string one on each line. 

Constraints
1 < N < 10000
1 < |S| < 1000


Output Format
The words should be lexicographically sorted and should be displayed one per each line. 

Sample TestCase 1
Input
10
fortran
java
perl
python
php
javascript
c
cpp
ruby
csharp
Output
c 

cpp 

csharp 

fortran 

java 

javascript 

perl 

php 

python 

ruby*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   int l;
   Scanner sc = new Scanner(System.in);
   l = sc.nextInt();

   if(l<=10000)
   {
   String words[]; 
   words = new String [l];
   int i,j;
   for(i=0;i<l;i++)
   {
      words[i] = sc.next();
   }

        for(i = 0; i < (l-1); ++i)
         {
            for (j = i + 1; j < l; ++j) 
            {
                if (words[i].compareTo(words[j]) > 0) 
                {

                    // swap words[i] with words[j]
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        for(i = 0; i < l; i++) 
        {
            System.out.print(words[i]);
            if(i!=(l-1))
            System.out.print('\n');
      
         }  
   }   
   }   
}
