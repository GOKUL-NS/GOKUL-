import java.util.*;
class arrjj
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        int c1=0,c2=0,cc=0;
        int k=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(ar[i]>0)
            {
            while(ar[i]!=0)
            {
            arr.add(ar[i]%10);
            ar[i]/=10;
            }
            }
            else{
                arr.add(ar[i]);
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            
                if(arr.get(i)==k)
                {
                    c1++;
                }
            
        }
            System.out.print(c1);
        
                
    }
}
