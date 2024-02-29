import java.util.Scanner;

public class Fibonacci {

       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to fibonacci Series");
              System.out.print("Please Enter a number: ");
              int num = input.nextInt();
              System.out.println("Fibonaaci sereis is");
              fibonacci(num);

       }
       public static void fibonacci(int num){
              if(num < 0)return;
              System.out.print("0 ");
              if(num == 0)return;
              System.out.print("1 ");
              int first = 0 , second = 1;
              while(first + second <= num){
                     int third = first + second;
                     System.out.print(third + " ");
                     first = second;
                     second = third;

              }
       }
}