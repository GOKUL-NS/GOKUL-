import java.util.*;
class four
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
            String a=s.nextLine();
            String b=s.nextLine();
            String c=new StringBuffer(b).reverse().toString();
            String f=a+c;
            String g="";
            
           
            
            for(int i=0;i<f.length();i++)
            {
                char e=f.charAt(i);
                if(Character.isUpperCase(e))
                {
                    g=g+Character.toLowerCase(e);
                    
                }
                    else 
                {
                    g=g+Character.toUpperCase(e);
                   
               
                }}
                
            
            System.out.print(g);
    }
}

