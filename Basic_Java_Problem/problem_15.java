import java.util.*;

public class problem_15 {
    
    public static void main(String[] arg){

       Scanner input = new Scanner (System.in);
       int n=input.nextInt();
       int[] v= new int[200];

       for(int i=0; i<n;i++){
         v[i]=input.nextInt();       
        }
        int x=input.nextInt();
      
        boolean f= false;
        for(int i = 0; i < n; i++) {
            if(v[i] == x){
               f=true;  break;
            }
            else{
                f=false;
            }
        }
       
        String result=(f)?"YES_FOUND" :"NOT_FOUND";
        System.out.println(result);
    }
}
