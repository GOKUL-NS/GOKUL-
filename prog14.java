import java.util.*;
class bb
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int vow=0,cons=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='A'||a.charAt(i)=='e'||a.charAt(i)=='E'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='I'||a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U')
            {
                vow++;
            }
            else
            {
                cons++;
            }
        }
        if(vow>=1)
        {
            a=a.replaceAll("[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz]","");
            System.out.print(a);
        }
        else
        {
            System.out.print("all letters are consonants");
        }
    }
}
