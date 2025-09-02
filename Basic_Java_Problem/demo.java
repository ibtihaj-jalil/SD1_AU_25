import java.util.*;
public class demo {
   public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);


       System.out.print("Enter Your Name:");
       String name=sc.nextLine();

       System.out.print("Enter Your Age:");
       int age=sc.nextInt();

       System.out.print("Enter Your Salary:");
       double salary=sc.nextDouble();

       System.out.println("Name:"+ name);
       System.out.println("Age:"+age);
       System.out.println("Salary:"+salary);

   }
}
