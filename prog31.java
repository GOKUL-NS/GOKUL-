import java.util.*;
class vali
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        String c=s.next();
        String d="",e="";
        int i=0,j=0,k=0;
        if(a.length()+b.length()==c.length())
        {
        while(k<c.length())
            {
                if(i<a.length()&&a.charAt(i)==c.charAt(k))
                {
                    d+=c.charAt(k);
                    i++;
                }
                else if(b.charAt(j)==c.charAt(k)&&j<b.length())
                {
                    e+=c.charAt(k);
                    j++;
                }
             
                k++;
           }
        
        if(i==a.length()&&j==b.length())
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("false");
        }
        }
        else
        {
            System.out.print("false");
        }  
    }
}







