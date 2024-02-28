import java.util.Scanner;

public class Sumofdigitinteger {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to sum of digit integer");
              System.out.print("Enter the number: ");
              int num = input.nextInt();
              int sum = sumofint(num);
              System.out.println("The sum of digit is " + num + " is " + sum);

       }
       public static int sumofint(int num){
              int sum = 0;
              while(num > 0){
                     sum += (num % 10);
                     num /= 10;
              }
              return sum;

       }
       
}
