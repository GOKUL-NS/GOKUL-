import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n+1;
        int x=n-1;
        int j=1;
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                if(i%2==0)
                {
                    if(j==1)
                    {
                        System.out.print(x);
                        x++;
                    }
                    else
                    {
                        System.out.print(i);
                    }
                }
                else if(i%2!=0)
                {
                    if(j==m)
                    {
                        System.out.print(x);
                        x++;
                    }
                    else
                    {
                        System.out.print(i);
                    }
                }
                if(i!=m&&j!=m)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
