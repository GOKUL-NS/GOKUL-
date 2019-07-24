import java.util.*;
class alien{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String [] s1={"F","8","Fo","FF","F8","8o","8F","88","Foo","FoF"};
        for(int i=1; i<=10;i++){
            if(i==n){
                System.out.print(s1[i-1]);
            }
            if(n == 0 || n>10){
                System.out.print("alien numeral value not possible for the given decimal value");
            }
        }
    }
}

