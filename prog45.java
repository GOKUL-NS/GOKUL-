import java.util.*;
class cool
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        long n=s.nextInt();
        long n1=n;
        int sum=0,sum1=0;
        int c=0,f=0;
        if(n<10||n==0)
        {
            System.out.print("Balanced");
        }
        else
        {
           while(n1>0)
           {
               n1=n1/10;
               c++;
           }
           if(c%2==0)
           {
           f=c/2;
           if(c==2)
           {
               sum+=n%10;
               n=n/10;
               sum1+=n%10;
               if(sum==sum1)
               {
                   System.out.print("Balanced");
               }
               else
               {
                   System.out.print("Not Balanced");
               }
           }
           
           else
           {
           while(f>1)
           {
            sum+=n%10;
            n=n/10;
            f--;
           }
           f=c/2;
           n=n/100;
           while(f>1)
           {
               sum1+=n%10;
               n=n/10;
               f--;
           }
           if(sum==sum1)
           {
               System.out.print("Balanced");
               
           }
           
           else
           {
               System.out.print("Not Balanced");
           }
           }
           }
           else
           {
               f=c/2;
               while(f>0)
               {
                   sum+=n%10;
                   n=n/10;
                   f--;
               }
               n=n/10;
               f=c/2;
               while(f>0)
               {
                   sum1+=n%10;
                   n=n/10;
                   f--;
               }
               if(sum==sum1)
               {
                   System.out.print("Balanced");
               }
               else
               {
                   System.out.print("Not Balanced");
               }
           
           }
        }
    }
}
