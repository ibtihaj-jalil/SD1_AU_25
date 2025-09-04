import java.util.*;

public class problem_11 {
    
    public static void main(String[] arg){

       Scanner input = new Scanner (System.in);
       int n=input.nextInt();
       int[] v= new int[200];

       for(int i=0; i<n;i++){
         v[i]=input.nextInt();       
        }
       
        int max=v[0];
        for(int i = 1; i < n; i++) {
            if(max < v[i]){
                max=v[i];
            }
        }

        System.out.println(max);
    }
}
