import java.util.*;
class bad
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int j,i;
        int count=0,f=0,l1=0,l2=0;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i;j<n-1;j++){
            if(a[j]<=a[j+1])
            {
                count++;
            }
            else
            {
                break;
            }
        }
        if(count>f)
        {
            f=count;
            l1=i;
            l2=j;
        }
        count=0;
            
        }
        if(f>0)
        {
            for(int k=l1;k<=l2;k++)
            {
                System.out.print(a[k]+" ");
            }
        }
        else
        {
            System.out.print("progressive sequence not possible");
        }
        
    }
}

