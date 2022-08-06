// Factorial of a number
import  java.util.*;
public class functions{
    public static void f(int num){
        int product=1;
        for(int i=num;i>0;i--){
            product*=i;
        }
        System.out.print(product);
        return;
        }
        public static void main(String args[]){
            Scanner f=new Scanner(System.in);
            int num=f.nextInt();
            f(num);
        }
}










// import java.util.*;
// public class functions {
//     public static int mul(int a, int b){
//         int c;
//         c=a*b;
//         return c;
//     }
//     public static void main(String args[]){
//         Scanner n=new Scanner(System.in);
//         int s=n.nextInt();
//         int ss=n.nextInt();
//         int product=mul(s,ss);
//         System.out.print(product);

       
//     }
// }
