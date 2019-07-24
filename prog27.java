import java.util.*;
class pass
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int c1=0,c2=0,c3=0,c4=0,c5=0,cc=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>='A'&&a.charAt(i)<='Z')
            {
                c1++;
            }
            if(a.charAt(i)>='a'&&a.charAt(i)<='z')
            {
                c2++;
            }
            if(a.charAt(i)>='0'&&a.charAt(i)<='9')
            {
                c3++;
            }
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    c4++;
                }
            }
            if(c4<=2)
            {
                c5++;
            }
            c4=0;
            if(a.charAt(i)=='!'||a.charAt(i)=='@'||a.charAt(i)=='#'||a.charAt(i)=='$'||a.charAt(i)=='%'||a.charAt(i)=='^'||a.charAt(i)=='&'||a.charAt(i)=='*'||a.charAt(i)=='('||a.charAt(i)==')'||a.charAt(i)=='+'||a.charAt(i)=='='||a.charAt(i)=='_'||a.charAt(i)=='-'||a.charAt(i)=='{'||a.charAt(i)=='}'||a.charAt(i)=='['||a.charAt(i)==']'||a.charAt(i)==';'||a.charAt(i)==':'||a.charAt(i)=='"'||a.charAt(i)=='\''||a.charAt(i)=='?'||a.charAt(i)=='<'||a.charAt(i)=='>'||a.charAt(i)==','||a.charAt(i)=='.')
            {
                cc++;
            }
        }
        if(a.length()>6&&a.length()<24&&c1>=1&&c2>=1&&c3>=1&&c5==a.length()&&cc==1)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}

