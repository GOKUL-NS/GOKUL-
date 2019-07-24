import java.util.*;
class mult
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int mu=1,r,count;
        if(n<9)
        {
            count=0;
        }
        else{
            count=1;
        
        while(n!=0)
        {
            while(n!=0)
            {
            r=n%10;
            n=n/10;
            mu=mu*r;
               
            }
            if(mu>9){
                count++;
                n=mu;
                mu=1;
            }
        }
        }
        
        System.out.print(count);
    }
}
