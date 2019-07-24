import java.util.*;
class disarium
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int n1=n,count=0,sum=0,n2=n,r=0,g=0;
       while(n1!=0)
       {
           n1=n1/10;
           count++;
       }
       while(n!=0)
       {
           r=n%10;
           g=r;
           n=n/10;
           for(int i=1;i<count;i++)
           {
               r*=g;
           }
           sum=r+sum;
           count--;
           
       }

       if(sum==n2)
       {
           System.out.print("YES");
       }
       else
       {
           System.out.print("NO");
       }
    }
}
