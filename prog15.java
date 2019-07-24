import java.util.*;
class mon
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int max=0,count,count1;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        
        {
            count=0;
            count1=0;
            for(int j=0;j<n;j++)
            {
                if((a[i]-a[j]>=0)&&(a[i]-a[j]<=1))
                
                {
                    count++;   
                }
                if((a[i]-a[j]<=0)&&(a[i]-a[j]>=-1))
                {
                    count1++;
                }
            }
            if(max<count1)
            {
                max=count1;
            }
            if(max<count)
            {
                max=count;
            }
            
        }
        System.out.print(max);
    }
}
