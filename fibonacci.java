import java.util.*;

public class fibonacci {
    public static void fib(int limit){
        if(limit>=0){
        int f0=0;
        int f1=1;
        int fn;
        for(int integer=0;integer<limit-2;integer++){
            fn=f1+f0;        
        f0=f1;
        f1=fn;
        if(limit==0){
            System.out.print("0");}
        else if(limit==1){
            System.out.print("1");}
        else{
        System.out.print(fn+" "); 
        }
    }
    }
    }
           
        
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int limit=sc.nextInt();
            fib(limit);
        }
    }

