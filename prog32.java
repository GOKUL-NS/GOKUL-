import java.util.*;
class arrr
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        int d=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]-ar[j]==d||ar[j]-ar[i]==d)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
