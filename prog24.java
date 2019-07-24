import java.util.*;
class alph
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String sr=s.nextLine();
        sr=sr.toLowerCase();
        String s1="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<sr.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(sr.charAt(i)==s1.charAt(j))
                {
                    System.out.print(j+1);
                }
            }
        }
    }
}
