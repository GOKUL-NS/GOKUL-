import java.util.*;
class aaaa
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<0)
        {
           n=n*-1; 
        }
        int sum=0;
        for(int i=2;i<n;i++)
        {
            
           /* if(4*i==n)
            {
                sum=i*i*i*i;
            }
            else
            {*/
                for(int j=i;j<n;j++)
                {
                    for(int k=i;k<n;k++)
                    {
                        for(int l=i;l<n;l++)
                        {
                            if(n%i==0&&n%j==0&&n%k==0&&n%l==0)
                            {
                            if((i+j+k+l)==n)
                            {
                                sum=i*j*k*l;
                            }
                            }
                        }
                    }
                }
            
           
        }
        if(sum>0)
        {
        System.out.print(sum);}
        else if(n==4)
        {
            System.out.print("1");
        }
        else if(n==0)
        {
            System.out.print("0");
        }
        else
        {
            System.out.print("-1");
        }
    }
}

