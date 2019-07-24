import java.util.Scanner;
class tue1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int count=0;
        char z;
        StringBuffer b=new StringBuffer(a);
        StringBuffer rev=new StringBuffer();
        for(int i=a.length()-1;i>=0;i--)
        {
            rev.append(a.charAt(i));
        }
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)==rev.charAt(i))
            {
                count++;
            }
        }
        if(count==b.length())
        {
            System.out.print("-1");
        }
       
        else
        {
count=0;
            for(int j=0;j<a.length();j++)
            {
                z=a.charAt(j);
                 b.deleteCharAt(j);
                 rev.setLength(0);
                
                 for(int k=b.length()-1;k>=0;k--)
                 {
                     rev.append(b.charAt(k));
                 }
               
               for(int i=0;i<b.length();i++)
               {
                   if(b.charAt(i)==rev.charAt(i))
                   {
                       count++;
                   }
               }
               
            if(count==b.length())
            {
                System.out.print(z);
            }
            count=0;
            b.setLength(0);
            b.append(a);
            
           
            }
        }
    
    }
}




