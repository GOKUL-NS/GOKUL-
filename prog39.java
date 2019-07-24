import java.util.*;
class three
{
    public static void main(String[] args)
    {
        
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
            {
                count++;
            }
        }
        if(count>0){
       
        a=a.replace("a","z");
        a=a.replace("e","z");
        a=a.replace("i","z");
        a=a.replace("o","z");
        a=a.replace("u","z");
        System.out.println(a);}
        else
        {
            System.out.print("No vowels present");
        }
    }
}
