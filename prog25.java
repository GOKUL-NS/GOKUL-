import java.util.*;
class pat1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(i>1&&i<n)
            {
                for(int k=1;k<i;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j=i+1;j<=n1;j++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
                n1++;
               
                
            }
            else if(i==n)
            {
                for(int l=1;l<i;l++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=n;k++)
                {
                    System.out.print("*");
                }
            }
        }
    }
}
