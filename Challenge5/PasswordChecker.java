package Challenge5;

import java.util.Scanner;
public class PasswordChecker {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to password Checker. Minimum length password is 6.");
              String password;
              do{
                     System.out.print("Please enter Your password: ");
                     password = input.next();
              }
              while(!isValidpassword(password));
              System.out.println("Your password is Correct..");

       }

       public static boolean isValidpassword(String password){
              return password.length() >= 6;


       }
}
