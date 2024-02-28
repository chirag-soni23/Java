import java.util.Scanner;

public class Oddsum {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Odd sum Calculator");
              System.out.print("Please Enter a number: ");
              int num = input.nextInt();
              System.out.println(Odd(num));
       }    
       public static int Odd(int num){
              int sum = 0;
              int i = 1;
              while (i <= num){
                     sum += i;
                     i += 2;
                     
              }
              return sum;

       }   
}
