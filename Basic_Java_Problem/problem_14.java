import java.util.*;

public class problem_14 {
    
    public static void main(String[] arg){

       Scanner input = new Scanner (System.in);
       int n=input.nextInt();
       int[] v= new int[200];

       for(int i=0; i<n;i++){
         v[i]=input.nextInt();       
        }
       
        int odd_cnt=0, even_cnt=0;
        for(int i = 0; i < n; i++) {
            if((v[i] & 1)==0){
               odd_cnt++;
            }
            else{
                even_cnt++;
            }
        }

        System.out.println("odd:"+odd_cnt+"   "+"&  even:"+even_cnt);
    }
}
