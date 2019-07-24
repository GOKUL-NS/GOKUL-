import java.util.*;
class luck 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
            int a=s.nextInt();
            
            int count=0;
            int digits[]=Integer.toString(a).chars().map(c->c-'0').toArray();
            System.out.print(digits);
            /*int[] ar=Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
            String
            System.out.print(ar);*/
            /*for(int i=0;i<ar.length();i++)
            {
                
                if(ar(i)-ar(i+1)==2||ar(i)-ar(i+1)==-2)
                {
                    count++;
                }
            }
            if(count==ar.length()-1)
            {
                System.out.print("lucky");
            }
            else
            {
                System.out.print("not lucky");
            }*/
       
        
    }
}

