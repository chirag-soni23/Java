import java.util.Scanner;

public class PalindromeRecrusion {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Palindrome");
              System.out.print("Enter a sentence if you want to Check Palindrome or not: ");
              String str = input.next();
              System.out.println("Your sentence is " + (isPalindrome(str)?"Plaindrome" : "Not Palindrome"));
              
       }
       public static boolean isPalindrome(String str){
              if(str.length() <=1){
                     return true;
              }
              int lastPosition = str.length() - 1;
              if(str.charAt(0) != str.charAt(lastPosition)){
                     return false;
              }
              return isPalindrome(str.substring(1,lastPosition));

       }
}
