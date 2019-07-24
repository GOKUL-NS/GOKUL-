import java.util.*;
class sun1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        st=st.toLowerCase();
        int n=st.length();
        char ar[]=st.toCharArray();
        /*for(int i=0;i<n;i++)
        {
            ar[i]=st.charAt(i);
        }*/
        Arrays.sort(ar);
        /*System.out.print(ar);*/
        
        String al="abcdefghijklmnopqrstuvwxyz";
        char ar1[]=al.toCharArray();
        int count=0,d=0,c=0;
        for(int i=0;i<=25;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ar1[i]==ar[j])
                {
                    count++;
                }
              
            }          
            if(count==1)
            {
                c++;
            }
            count=0;
            d=0;
        
        }
        /*for(int k=0;k<=25;k++)
        {*/
            for(int l=0;l<n-1;l++)
            {
                if(ar[l]-ar[l+1]==1||ar[l]-ar[l+1]==-1)
                {
                    d++;
                }
            }
        
        if(c==n&&d==n-1)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
