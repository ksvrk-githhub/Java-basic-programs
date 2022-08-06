import java.util.*;
public class Voting_age{
    public static void main(String args[]){
        System.out.println("Enter your age");
        Scanner age=new Scanner(System.in);
        int num=age.nextInt();
        if(num>=21){
            System.out.println("Eligible");
        }
        else{
            int gap;
            gap=21-num;
            System.out.println("Not-Eligible visit after "+gap+" years");
        }

    }
    
}
