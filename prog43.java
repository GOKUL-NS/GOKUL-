import java.util.*;
class cool
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a;
        int c=0;
        while(b!=0)
        {
            b=b/10;
            c++;
        }
        int i=c-1,cc=0,temp=0,sum=0,ccc=0;
        int ar[]=new int[c];
      while(a!=0)
      {
          ar[i]=a%10;
          a=a/10;
          i--;
      }
      for(int j=0;j<c;j++)
      {
          for(int h=0;h<c;h++)
          {
              sum=(sum*10)+ar[h];
          }
          for(int g=2;g<sum;g++)
          {
              if(sum%g==0)
              {
                  cc++;
              }
          }
          if(cc==0)
          {
              ccc++;
          }
          cc=0;
          temp=ar[0];
          for(int l=1;l<c;l++)
          {
              ar[l-1]=ar[l];
          }
          ar[c-1]=temp;
          sum=0;
          
      }
      if(ccc==c)
      {
          System.out.print("yes");
      }
      else
      {
          System.out.print("no");
      }
    }
}
