import java.util.Scanner;

public class Switchcalculator {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.print("Please, Enter first number: ");
              int num1 = input.nextInt();
              System.out.print("Now, Enter second number: ");
              int num2 = input.nextInt();
              System.out.print("And finally, Enter a operation: ");
              String operation = input.next();

              int result = switch(operation){
                     case "+" -> num1 + num2;
                     case "-" -> num1 - num2;
                     case "*" -> num1 * num2;
                     case "/" -> num1 / num2;
                     case "%" -> num1 % num2;
                     default -> -1;
              };
              System.out.println("The result is: " + result);
       }
}
