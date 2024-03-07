package Challenge5;
import java.util.Scanner;
public class PrimeNumber {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Prime Number");
              System.out.print("Please, Enter a number if you want to check a number prime or not: ");
              int num = input.nextInt();
              boolean isPrime = isPrime(num);
              System.out.println("The number is " + (isPrime ? "Prime" : "Not Prime"));
       }
       public static boolean isPrime(int num){
              for(int i = 2;i<=num;i++){
                     if(num % i == 0){
                            return true;
                     }
              }
              return false;
       }

}
