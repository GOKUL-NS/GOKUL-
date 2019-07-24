import java.util.*;
class zspan
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            if(i==1||i==n){
            for(int j=1;j<=n;j++){
            System.out.print("*");}
            System.out.println();}
           else
            {      
                for(int k=1;k<i;k++)
                {
                    System.out.print(" ");}
                    System.out.print("*");
                }         
                System.out.println();
            }     
        }    
    }
}
