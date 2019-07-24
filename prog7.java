import java.util.*;
class mmm
{
   
    public static void  main(String[] args)
    {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<0)
        {
            n=n*-1;
        }
        int n1=n,c=0;
        int sum=0;
        while(n1!=0)
        {
            n1=n1/10;
            c++;
        }
        int l=0;
        int ar[]=new int[c];
        while(n!=0)
        {
            ar[l]=n%10;
            l++;
            n=n/10;
        }
        Arrays.sort(ar);
        int k=0;
        int ar1[]=new int[c];
        for(int i=c-1;i>=0;i--)
        {
           
    
         System.out.print(ar[i]);
        }
    }
    
}



