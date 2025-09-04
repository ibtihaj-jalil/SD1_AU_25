import java.util.*;
public class problem_4 {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);


        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();

        if((x>=y) && (x>=z)){
            System.out.println(x);
        }
        else  if((y>=x) && (y>=z)){
            System.out.println(y);
        }
        else{
             System.out.println(z);
        }
    }
}
