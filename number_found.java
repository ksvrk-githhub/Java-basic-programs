import java.util.*;

public class number_found {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int find[]=new int[size];
        for(int i=0;i<size;i++){
            find[i]= sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<size;++i){
            if(find[i]==x){
                System.out.print(i+" ");
            }
        }        
    }

        
}
