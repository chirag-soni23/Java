import java.util.Scanner;

public class Recrusion{
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to factorial");
              System.out.print("Please, Enter a number: ");
              int num = input.nextInt();  
              long fact = factorial(num);
              System.out.println("Factorial of number is: " + fact);  
       }
       // Recrusive function
       public static long factorial(int num){
              System.out.println("Factorial of number: " + num);
              if(num == 1){
                     return 1;
              }
              return num * factorial(num - 1);
       }




       // Non-Recrusive function
       // public static long factorial(int num){
       //        long result = 1;
       //        for(int i = 1;i<=num;i++){
       //               result *= i;

       //        }
       //        return result;
       // }
}