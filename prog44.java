import java.util.*;
class cool
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        long b=s.nextLong();
        long c=0;
        int v=0,e=0;
        ArrayList<Long> ar=new ArrayList<Long>();
        for(long i=a;i<b;i++)
        {
            c=i;
            if(c<0)
            {
                c=c*-1;
            }
            if(c==0)
            {
                System.out.print(c+" ");
            }
    
            while(c>0)
            {
               ar.add(c%10);
               c/=10;
                v++;
            }
            for(int j=0;j<v-1;j++)
            {
                if(ar.get(j)-ar.get(j+1)==1||ar.get(j+1)-ar.get(j)==1)
                {
                    e++;
                }
            }
            if(e==v-1)
            {
                System.out.print(i+" ");
            }
            v=0;
            e=0;
           ar.clear();
        }
    }
}



