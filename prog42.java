import java.util.*;
class cool
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String st=s.nextLine();
        int i1=0;
        //System.out.print(a);
        String ar[]=st.split(" ");
        for(int i=0;i<ar.length;i++)
        {
           for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)==ar[i].charAt(j))
                {
                i1++;
                }
                
            }
        if(i1==a.length())
        {
            
                System.out.print(ar[i]+" ");
        }  
        i1=0;
        }
    }
}
