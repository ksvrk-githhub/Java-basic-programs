import java.util.*;
public class robot_instructions {
    public static void main(String args[]){
        System.out.println("Press a button\n 1- Shake hand\n 2- Play chess\n 3- Explain physics");
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();
        if(n==1){
            System.out.print("Shake hand");
        }
        else if(n==2){
            System.out.print("Play CHess"); 
        }
        else{
            System.out.print("Explain Physics");
        }

    }
    
}
