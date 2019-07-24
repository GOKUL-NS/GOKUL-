import java.io.*;
import java.util.*;
class brac
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int left_br=1,count=0;
        Stack<Integer> right_br=new Stack<Integer>();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='('||a.charAt(i)==')')
            {
                count++;
            }
        }
        if(count%2!=0||count==0)
        {
            System.out.print("Invalid Expression");
        }
        else{
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='(')
            {
                System.out.print(left_br+" ");
                right_br.push(left_br);
                left_br++;
            }
            else if(a.charAt(i)==')')
            
            {
                System.out.print(right_br.peek()+" ");
                right_br.pop();
            }
        }
        /*for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='('||a.charAt(i)==')')
            {
                count++;
            }
        }
        if(count%2!=0||count==0)
        {
            System.out.print("Invalid Expression");
        }*/
        }
    }
}


