import java.util.*;
public class problem_3 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
    
     System.out.print("Enter a Number:");
    int n=input.nextInt();

    if((n&1)==0){
        System.out.println("Even");

    }
    else{
        System.out.println("Odd");
    }

    }
}
