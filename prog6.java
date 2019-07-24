import java.util.*;
class bob
{
    public static void main(String[] args)
    {   int n,b=0,sum=1,count=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            
            if(a[i]==a[j])
            {
                   sum=sum*a[j];
                   count++;
                
            }
            }
            
        }
        if(count==0||count<2)
        {
            System.out.print("-1");
        }
        System.out.print(sum);
        
    }
}



