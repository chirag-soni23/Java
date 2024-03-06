package Challenge4;
import java.util.Scanner;
public class MinimumofTwonum{
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to minimum number Checker");
              System.out.print("Please, Enter the first number: ");
              int num1 = input.nextInt();
              System.out.print("Now, Enter the Second number: ");
              int num2 = input.nextInt();
              MinimumofTwonum ternary = new MinimumofTwonum();
              int min = ternary.min(num1, num2);
              System.out.println("Minimum number is: " + min);
       }

       public int min(int num1, int num2){
              return num1 < num2 ? num1 : num2;
              // if(num1<num2){
              //        return num1;
              // }
              // else{
              //        return num2;
              // }
       }
}