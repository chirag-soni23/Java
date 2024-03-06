package Challenge4;

import java.util.Scanner;

public class OddandEven {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Odd or Even number Checker");
              System.out.print("Please, Enter a number: ");
              int num = input.nextInt();
              String oddoreven = num % 2 == 0 ? "Even" : "Odd";
              System.out.println("The number is: " + oddoreven);
       }
}
