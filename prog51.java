import java.util.*;
class three
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        String c=s.next();
        String f1="";
        String m1="";
        String l1="";
        
        String r[]=new String[3];
        r[0]=a;
        r[1]=b;
        r[2]=c;
        int d=0,r1=0;
       for(int i=0;i<3;i++)
       {
           r1=r[i].length()%3;
        if(r[i].length()%3==0)
        {
            d=r[i].length()/3;
           f1+=r[i].substring(0,d);
           m1+=r[i].substring(d,2*d);
           l1+=r[i].substring(2*d,r[i].length());
           
        }
        else if(r1==1)
        {
            d=r[i].length()/3;
            f1+=r[i].substring(0,d);
            m1+=r[i].substring(d,2*d+1);
            l1+=r[i].substring(2*d+1,r[i].length());
            
        }
        else
        {
            d=r[i].length()/3;
            f1+=r[i].substring(0,d+1);
            m1+=r[i].substring(d+1,2*d+1);
            l1+=r[i].substring(2*d+1,r[i].length());
        }
        
       }
       System.out.println(f1);
       System.out.println(m1);
       for(int i=0;i<l1.length();i++)
       {
           if(l1.charAt(i)>='A'&&l1.charAt(i)<='Z')
           {
               System.out.print((char)(l1.charAt(i)+32));
           }
           else if(l1.charAt(i)>='a'&&l1.charAt(i)<='z')
           {
               System.out.print((char)(l1.charAt(i)-32));
           }
           else
           {
               System.out.print(l1.charAt(i));
           }
       }
        
    }
}

