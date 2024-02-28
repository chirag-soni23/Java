import java.util.Scanner;

public class Factorial{
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to factorial");
              System.out.print("Please Enter to number: ");
              int num = input.nextInt();
              long fact = factorial(num);
              System.out.println("The factorial of " + num + " is " + fact);

       }
       public static long factorial(int num){
              if(num < 2){
                     return 1;
              }
              int fact = 1;
              int i = 2;
              while(i <= num){
                     fact *= i;
                     i++;
              }
              return fact;

       }
}