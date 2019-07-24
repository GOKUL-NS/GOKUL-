import java.util.*;
class biton
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int ar[]=new int[args.length];
        int big=0,count=0,cou=0,ss=0,count1=0,count2=0;
        for(int i=0;i<args.length;i++)
        {
            ar[i]=Integer.parseInt(args[i]);
            cou++;
        }
        if(ar[0]>ar[1])
        {
            System.out.print("Invalid Input");
        }
        else
        {
        for(int i=1;i<cou;i++)
        {
            
            if(ar[i]<ar[i-1])
            {
                for(int j=i;j<cou;j++)
                {
                    if(ar[j-1]>ar[j]){
                        count2++;
                    }}
                
                if(count2==cou-(i)){
                big=ar[i-1];
                count++;
                break;}
            }}
           
        if(count>0){
        System.out.print(big);}
        else{
            System.out.print("Invalid Input");
        }}
        
    }
}

