import java.util.Scanner;

public class BitwiseOddorEven {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Bitwise odd or even calculator");
              System.out.print("Enter a number: ");
              int num = input.nextInt();

              if((num & 1) == 1){
                     System.out.println("The number is odd.");
              }
              else{
                     System.out.println("The number is even.");
              }
              

       }
       
}
