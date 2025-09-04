import java.util.*;

public class problem_12 {
    
    public static void main(String[] arg){

       Scanner input = new Scanner (System.in);
       int n=input.nextInt();
       int[] v= new int[200];

       for(int i=0; i<n;i++){
         v[i]=input.nextInt();       
        }
       
        int min =v[0];
        for(int i = 1; i < n; i++) {
            if(min > v[i]){
                min=v[i];
            }
        }

        System.out.println(min);
    }
}
