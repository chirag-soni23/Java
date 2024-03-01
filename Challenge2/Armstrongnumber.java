import java.util.Scanner;

public class Armstrongnumber {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to  armstrong number");
              System.out.print("Please, Enter a number: ");
              int num = input.nextInt();
              boolean arms = isarmstrong(num);
              if(arms){
                     System.out.println("Yes, it is a armstrong number.");
              }
              else{
                     System.out.println("Not, it is not a armstrong number.");
              }
              

       }
       public static boolean isarmstrong(int num){
              int digit = noOfdigit(num);
              int originalNum = num;
              int finalNumber = 0;
              while(num > 0){
                     int lastDigit = num % 10;
                     num /= 10;
                     finalNumber += pow(lastDigit,digit);
              }
              return finalNumber == originalNum;
       }

       public static int pow(int num1, int num2){
              int result = 1;
              int i = 0;
              while(i < num2){
                     result *= num1;
                     i++;

              }
              return result;
       }



       public static int noOfdigit(int num){
              int digit = 0;
              while(num > 0){
                     digit++;
                     num /= 10;
              }
              return digit;
       }
}
