import java.util.*;

public class problem_13 {
    
    public static void main(String[] arg){

       Scanner input = new Scanner (System.in);
       int n=input.nextInt();
       int[] v= new int[200];

       for(int i=0; i<n;i++){
         v[i]=input.nextInt();       
        }
       
        int sum=0;
        for(int i = 1; i < n; i++) {
            sum+=v[i];
        }

        System.out.println(sum/n);
    }
}
