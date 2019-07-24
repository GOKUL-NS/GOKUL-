import java.io.*;
import java.util.*;
class doors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        String s1[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s1[i]=sc.next();
        }
        for(int i=1;i<s1.length;i++)
        {
            if(s1[i-1].charAt(s1[i-1].length()-1)==s1[i].charAt(0))
            {
                count++;
            }
        }
        if(n<=25)
        {
            if(count==n-1)
            {
                System.out.println("Ordering is possible.");
            }
            else
            {
                System.out.println("The door cannot be opened.");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}



