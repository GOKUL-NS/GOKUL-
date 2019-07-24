import java.util.Scanner;
class dino
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n,k;
    n=s.nextInt();
    k=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
        
            for(int i=0;i<n;i++)
            {
            if(a[0]>a[i])
            a[0]=a[i];
            }
            if(k>a[0]){
            System.out.print(k-a[0]);
            }
            else
            {
                System.out.print("0");
            }
}
}
