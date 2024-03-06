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

              // Non ternary operator
              // int greatestNum;
              // if (num1 > num2) {
              //        greatestNum = num1;
              //        System.out.println(greatestNum + " is a greatest number.");
              // } else {
              //        greatestNum = num2;
              //        System.out.println(greatestNum + " is a greatest number.");
              // }

              // Ternay operator
              int greatestNum = num1 > num2 ? num1 : num2;
              System.out.println(greatestNum + " is a greatest number.");

              
       
       }
}