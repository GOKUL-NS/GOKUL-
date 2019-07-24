import java.util.*;
class valid
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='-')
            {
                c++;
            }
        }
        String b[]=a.split("/");
        int n=0,d=0;
        
        if(b[1].equals("0"))
        {
            System.out.print("Divide by Zero");
            
        }
        
        else
        {
            n=n+Integer.parseInt(b[0]);
            if(n<0)
            {
            n=n*-1;
            }
            if(n==0)
            {
                System.out.print("0");
            }
            else
            {
            d=d+Integer.parseInt(b[1]);
          
            for(int i=1;i<1000;i++)
            {
                
                for(int j=1;j<1000;j++)
                {
                if(n==(d*i)+j)
                {
                    if(c==1)
                    {
                        System.out.print("-");
                    }
                    System.out.print(i+" ");
                    System.out.print(j);
                    System.out.print("/"+d);
                }
                }
            }
            }
            
        }
    }
}

