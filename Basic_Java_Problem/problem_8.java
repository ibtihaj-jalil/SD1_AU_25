 import java.util.*;

public class problem_8 {
     public static void main(String [] args){
        Scanner input=new Scanner (System.in);

        int N=input.nextInt();
        int m=1;
        for(int i=N; i>=1; i--){
            m*=i;
        }
        System.out.println(N+"!="+m);
    }
}



