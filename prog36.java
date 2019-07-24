import java.util.*;
class valid
{
    public static void main(String[] args)
    {
        int ar[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            ar[i]=Integer.parseInt(args[i]);
        }
        int a=1,b=0;
        for(int i=0;i<args.length;i++)
        {
            
            for(int j=0;j<args.length;j++)
            {
    
                if(i!=j)
                {
                a*=ar[j];  
                }   
            }
            b+=a;
            a=1;
          
        }
        System.out.print(b);
        
    }
}
