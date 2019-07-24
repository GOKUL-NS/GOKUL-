import java.util.*;
class cool
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(int i=1;i<=n;i++)
       {
           String a=s.next();
           String b="";
           int c=0;
           for(int j=0;j<a.length();j++)
           {
               for(int k=j+1;k<=a.length();k++)
               {
                   b+=a.substring(j,k);
             
                   for(int h=0;h<b.length();h++)
                   {
                       if(b.charAt(h)=='a'||b.charAt(h)=='A'||b.charAt(h)=='e'||b.charAt(h)=='E'||b.charAt(h)=='i'||b.charAt(h)=='I'||b.charAt(h)=='o'||b.charAt(h)=='O'||b.charAt(h)=='u'||b.charAt(h)=='U')
                       {
                           c++;
                       }
                   }
                   b="";
               }
           }
           System.out.println(c);
       }
    }
}
