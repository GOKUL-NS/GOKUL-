import java.util.*;
import java.lang.Math;
class encrypt
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        a=a.replace("*"," ");
        a=a.toLowerCase();
        double x=Math.sqrt(a.length());
        int p=0;
        for(int i=0;i>=0;i+=x)
        {
            if(i>a.length()-1)
            {
                i=i-(a.length()-1);
            }
            if(a.charAt(i)!='.')
            {
                System.out.print(a.charAt(i));
            }
            p++;
            if(p>a.length()-1)
            {
                break;
            }
            
           
            
        }
    }
}


