import java.util.*;
class strong
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int v=n,x=1,y=0,z=n;
        int count=0;
        while(v!=0)
        {
            v=v/10;
            count++;
        }
        int l=count;
        int i=0;
        int a[]=new int[l];
        while(n!=0)
        {
            a[i]=n%10;
            i++;
            n=n/10;
        }
        
        for(i=0;i<l;i++)
        {
            for(int j=1;j<=a[i];j++)
            {
                x=x*j;
            }
            y=y+x;
            x=1;
           
        }
      
        if(y==z&&y!=0)
        {
            System.out.print("true");
        }
        else if(y==0)
        {
            System.out.print("false");
        }
        else
        {
            System.out.print("false");
        }
    }
}

