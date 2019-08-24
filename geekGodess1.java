/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode 
{
    private static String str;
    private static int t,len,k,i,max,m;
    private static char s,maxChar;

    private static int count (char s)
    {
      
        int n=0;
        for(i=0;i<len;i++)
        {
            if(str.charAt(i)==s)
            n++;
        }
        return n;
    }

    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        if(t>=1 && t<=10)
        {
            while(t!=0)
            {
                max=0;
                k=0;
                maxChar=0;
                str = sc.nextLine();
                len = str.length();

                while(k<len)
                {
                    s = str.charAt(k);
                    m = count(s);
                    if(max == m)
                    {
                        if(s<maxChar)
                        maxChar = s;                        
                    }
                    else if(m>max)
                    {
                        max = m;
                        maxChar = s;
                    }
                    k++;
                  
                }
                System.out.println(maxChar);
                t= t -1;;
            }

        }
        
   }
}
