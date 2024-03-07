package Challenge5;

import java.util.Scanner;

public class Numberguessing {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              int num = 5;
              System.out.println("Welcome to number guessing game.");
              int guess;
              do{
                     System.out.print("Please, Enter a number b/w 0 to 10: ");
                     guess = input.nextInt();
              }
              while(guess != num);
              System.out.println("Yes, Your guess is correct.");

       }
}
