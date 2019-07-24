import java.util.*;
class One{
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int count=0,c=0;
        if(a>0){
        while(a!=0)
        {
            
            a=a/10;
            count++;
           
            
        }
        System.out.print(count);
        
        }
        else if(a<0)
        {
            a=a*-1;
            while(a!=0)
            {
                a=a/10;
                c++;
            }
            System.out.print(c);
        }
        else{
            System.out.print("1");
        }
        
    }
}
