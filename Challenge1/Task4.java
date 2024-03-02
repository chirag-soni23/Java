import java.util.Scanner;

public class Task4{
       public static void main(String[] args) {
              System.out.print("Welcome to the swaping number station\n");
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.print("Enter the value of a: ");
              int a = input.nextInt();
              System.out.print("Enter the value of b: ");
              int b = input.nextInt();
              int c = a;
              a = b;
              b = c;
              System.out.println("Value of a is: " +  a);
              System.out.print("Value of b is: " +  b);

       }
}