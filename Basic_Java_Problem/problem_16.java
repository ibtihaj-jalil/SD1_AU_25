import java.util.*;

public class problem_16 {
    
    public static void main(String[] arg){

       Scanner input = new Scanner (System.in);
       int n=input.nextInt();
       int[] v= new int[n];

       for(int i=0; i<n;i++){
         v[i]=input.nextInt();       
        }
       
        Arrays.sort(v);

         for(int i = 0; i < n; i++){
            System.out.print(v[i] + " ");
        }
    }
}
