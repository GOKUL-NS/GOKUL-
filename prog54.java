import java.util.*;
class cipher
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a;
        int count=0;
        a=s.next();
        char b[]=a.toCharArray();
        char c[]=new char[26];
        char d='z';
        for(int i=0;i<c.length;i++)
        {
            c[i]=d;
            d--;
        }
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
               if(c[i]==b[j]) 
               {
                   count=count+1;
               }
            }
            if(count>0){
                
            System.out.print(c[i]);
            System.out.print(count);
            count=0;
            }
            
        }
       
        
        
    }
}

