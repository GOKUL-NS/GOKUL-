import java.util.*;
class happy
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n2=n;
        int ar[]=new int[10];
        int sum=0,z=0;
        while(n!=0)
        {
            while(n!=0)
            {
                ar[z]=n%10;
                z++;
                n=n/10;
            }
            for(int i=0;i<z;i++)
            {
               sum=sum+(ar[i]*ar[i]);
               
            }
            if(sum>9)
            {
                n=sum;
                sum=0;
                z=0;
            }
        }
        if(sum==1)
        {
            System.out.print("Happy");
        }
        else
        {
            System.out.print("UnHappy");
        }
    }
}

