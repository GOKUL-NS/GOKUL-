import java.util.*;

class text
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        a=a.replaceAll("\\s","");
        int l=a.length();
        int sq,r,c,x=0;
        float sq1;
        sq=(int)Math.sqrt(l);
        sq1=(float)Math.sqrt(l);
        if((sq-sq1)==0){
    
           r=sq;
           c=sq;
        }
        else
        {
            r=sq;
            c=sq+1;
        }
        char matr[][]=new char[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matr[i][j]=a.charAt(x);
                x++;
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(matr[j][i]);
            }
            if(i!=(c-1)){
         System.out.print(" ");}
        }
    }
}


