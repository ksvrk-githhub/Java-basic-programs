import java.util.*;
public class Sumofn {
    public static void main(String args[]){
        System.out.println("Enter the n value to find consecutive sum");
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        int sum=0;
        for( int counter=0;counter<=num;++counter){
            sum+=counter;
        }
        System.out.println(sum);

    }
    
}
