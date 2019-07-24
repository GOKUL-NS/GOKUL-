import java.util.*;
class fredo
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            x=x+a[i];
        }
        int y;
        for(int i=1;i<=1000;i++)
        {
           y=0;
           y=i*n;
           if(y>x)
           {
               System.out.print(i);
               break;
           }
           
        } 
    }
}
