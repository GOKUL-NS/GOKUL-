import java.util.*;
class cool
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String st1=st;
        st1=st1.replaceAll("//s","");
        int i=0;
            
            for(int j=st.length()-1;j>=0;j--)
            {
                
                    
                 if(st.charAt(j)!=' ')
                 {
                    if(st.charAt(i)==' ')
                    {
                        System.out.print(" ");
                        j++;
                    }
                    
                   else 
                   {
                    System.out.print(st.charAt(j));
                   }
                   i++;
                 }
        
            }
        
    }
}
