aimport java.util.*;
class cool
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=1;
        int b=2;
        int c=1,cc=0,n1=0,ccc=3,kk=0,j=3;
        if(n==1)
        {
            n1=a;
        }
        else if(n==2)
        {
            n1=b;
        }
        else if(n==3)
        {
            n1=c;
        }
        else
        {
        while(true)
        {   
            
                for(int k=2;k<j;k++)
                {
                    if(j%k==0)
                    {
                        cc++;
                    }
                }
                
                if(cc==0)
                {
                    n1=j;
                    ccc++;
                    kk++;
                }
                j++;
               if(kk==1)
               {
                if(ccc==n)
                {
                    break;
                }
                n1=a+c;
                a=c;
                c=n1;
            ccc++;
               }
            if(ccc==n)
            {
                break;
            }
            cc=0;
            kk=0;
        }
        }
        System.out.print(n1);
    }
}
