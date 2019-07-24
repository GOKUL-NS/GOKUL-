import java.util.*;
class dup
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,count=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
              for(int j=0;j<n;j++)
              {
                  if(a[i]==a[j])
                  {
                      count++;
                  }
              }
              if(count<2)
              {
                  System.out.print(a[i]+" ");
              }
              else if(count==n)
              {
                  System.out.print(a[0]);
                  
                 break;
              }
            
        count=0;
            }
           
        
        
        
    }
}

