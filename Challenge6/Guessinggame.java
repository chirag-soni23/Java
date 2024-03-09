package Challenge6;

import java.util.Scanner;

public class Guessinggame {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Number Guessing game,b/w 1 and 10");
            double num = Math.round(Math.random()*10+1);
            int guess;
            do {
              System.out.print("Please, Enter a guess: ");
              guess = input.nextInt();
              if(guess == num){
                     System.out.println("Congratulation, Your guess is correct.");
              }
              else if(guess<num){
                     System.out.println("Your guess is too low.");
              }
              else if(guess<1 || guess >10){
                     System.out.println("Please, enter a guess b/w 1 and 10");
                     break;
              }
              else{
                     System.out.println("Your guess is too high.");
              }
              
              
            } while (guess!=num);
             

       }
}
