import java.util.*;
class pate
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String n=s.next();
        int d=Integer.parseInt(n,8);
        System.out.print(Integer.toBinaryString(d));
        
    }
}
