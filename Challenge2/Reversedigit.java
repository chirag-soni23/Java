import java.util.Scanner;

public class Reversedigit {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to the reverse digit");
              System.out.print("Please, Enter a number: ");
              int num = input.nextInt();
              int reverse = reverse(num);
              System.out.println("The reverse digit is: " + reverse);

       } 
       public static int reverse(int num){
              int newNum = 0;
              while(num > 0){
                     int digit = num % 10;
                     newNum = (newNum * 10) + digit;
                     num /= 10;

              }

              return newNum;
       }      
}
