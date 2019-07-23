import java.util.Scanner;
class cather
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,count=0,sum=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        sum=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[0]<a[i])
            sum=a[i];
            
        }
        for(int i=0;i<n;i++)
        {
            if(sum==a[i])
            count++;
        }
        
        System.out.println(count);     
    }
}




