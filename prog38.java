import java.util.*;
class two
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int temp,n=20;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        
        {
            for(int j=i+1;j<n;j++)
            {
            if(a[i]<a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            }
        }
        
         for(int i=17;i<19;i++){
             
         
        System.out.print(a[i]+" ");}
        System.out.print(a[19]);
        
        System.out.println();
        for(int i=0;i<2;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print(a[2]);
        
        
    }
}




