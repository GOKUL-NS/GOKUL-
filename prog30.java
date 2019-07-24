import java.util.*;
class stt
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        String c="";
        int count=0;
        if(a.length()<=b.length())
        {
           System.out.print("0");
        }
        else
        {
            for(int i=0;i<a.length();i++)
            {
                for(int j=0;j<b.length();j++)
                {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        c+=a.charAt(i);
                        count++;
                    }
                }
            }
            char ch[]=c.toCharArray();
            Arrays.sort(ch);
            char ch1[]=b.toCharArray();
            Arrays.sort(ch1);
            if(Arrays.equals(ch,ch1))
            {
                System.out.print(a.length()-count);
            }
            else
            {
                System.out.print("0");
            }
        }
    }
}
