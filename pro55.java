import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class maili
{
   public static boolean isValid(String email)
   {
       String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z-0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$";
       Pattern pat=Pattern.compile(emailRegex);
       if(email==null)
           return false;
           return pat.matcher(email).matches();
   }
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       String email=s.nextLine();
       if(isValid(email))
       {
           System.out.print("true");
       }
       else
       {
           System.out.print("false");
       }
   }
}

