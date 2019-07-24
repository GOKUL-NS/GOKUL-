import java.util.*;
class path
{
    public static void main(String z[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int o=0,h=0;
        int c[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                c[i][j]=s.nextInt();
            }
        }
        int p=s.nextInt();
        int q=s.nextInt();
        if((c[p][q]==0)||(c[0][0]==0))
        {
            o=-1;
        }
        else
        {
            int x=0,y=0;
            while((x!=p)||(y!=q))
            {
                if(x+1<a)
                if(c[x+1][y]==1)
                {
                    o++;
                    if(x+1<a)
                    {
                        x=x+1;
                    }
                }
                else
                {
                    h++;
                }
                if(y+1<b)
                if(c[x][y+1]==1)
                {
                    o++;
                    y=y+1;
                }
                else
                {
                    h++;
                }
                if(h==2)
                {
                    o=-1;
                    break;
                }
                h=0;
            }
        }
        System.out.print(o);
    }
}
