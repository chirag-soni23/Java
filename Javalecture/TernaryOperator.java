import java.util.Scanner;

public class TernaryOperator {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Ternary operator");
              System.out.print("Enter a first number: ");
              int num1 = input.nextInt();
              System.out.print("Now, Enter a second number: ");
              int num2 = input.nextInt();

              // Non ternary operator;
              if (num1 > num2) {
                     System.out.println(num1 + " is a greatest number.");
              } else {
                     System.out.println(num2 + " is a greatest number.");
              }

       }
}