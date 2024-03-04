import java.util.Scanner;

public class Palindrome {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to palindrome");
              System.out.print("Please enter a number: ");
              int num = input.nextInt();
              boolean palindrome = isPalindrome(num);
              if (palindrome) {
                     System.out.println("Yes, it is a palindrome number");
              } else {
                     System.out.println("No, it is not a palindrome number");
              }

       }

       public static boolean isPalindrome(int num) {
              int reverse = reverse(num);
              return num == reverse;

       }

       public static int reverse(int num) {
              int newNum = 0;
              while (num > 0) {
                     int digit = num % 10;
                     newNum = (newNum * 10) + digit;
                     num /= 10;

              }

              return newNum;
       }
}
