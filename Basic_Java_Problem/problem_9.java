 import java.util.*;

public class problem_9 {
    
    public static void main(String [] args){
        Scanner input=new Scanner (System.in);

        int N=input.nextInt();
        int sum=0;
        for(int i=1; i<=N; i++){
            sum+=i;
        }
        System.out.println("Sum of all numbers from 1 to N:"+sum);
    }
}


