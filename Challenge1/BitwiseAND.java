import java.util.Scanner;

public class BitwiseAND{
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to bitwise AND Operators");
              System.out.print("Please Enter first number: ");
              int first = input.nextInt();
              System.out.print("Please Enter second number: ");
              int second = input.nextInt();

              int BitwiseAND = first & second;
              System.out.println("The result is: " + BitwiseAND);
       }
}