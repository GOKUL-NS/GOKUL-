import java.util.*;
class llll
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        int a=9;
        for(int i=0;i<n-1;i++)
        {
            if(ar[i+1]==0)
            {
               ar[i+1]=a; 
            }

       
            if((i+l)<n)
            {
                if(ar[i+l]==0)
            
            {
                ar[i+l]=a;
            }
            }
        }
        if(ar[n-1]==a)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}
