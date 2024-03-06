
import java.util.Scanner;

public class Absolutevalue{
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to absolute value");
              System.out.print("Please, Enter your number: ");
              int num = input.nextInt();
              int result = num >= 0 ? num : -num;
              System.out.println("The absolute value is: " + result);
       }
}