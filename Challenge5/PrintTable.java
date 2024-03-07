import java.util.Scanner;
public class PrintTable{
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Multiplicatio Table");
              System.out.print("Please, Enter a number if you  want to print table: ");
              int num = input.nextInt();
              for(int i = 1; i<=10;i++){
                     System.out.println(num + " x " + i + " = " + (num*i));
              }
       }
}