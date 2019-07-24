import java.util.*;
class goku
{
    public static void main(String[] args)
    {
        int ar[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            ar[i]=Integer.parseInt(args[i]);
        }
        int c=0,m=args.length-1;
        Arrays.sort(ar);
        while(m>0)
        {
            if(ar[m]==ar[m-1])
            {
                c++;
                m--;
            }
            m--;
        }
        System.out.print(c);
    }
}


