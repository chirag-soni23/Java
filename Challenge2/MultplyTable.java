import java.util.Scanner;

public class MultplyTable {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome table calculator");
              System.out.print("Enter a number: ");
              int num = input.nextInt();
              printMultiplytable(num);
       }
       public static void  printMultiplytable(int num){
              int i = 1;
              while(i <= 10){
                     System.out.println(num + " x " + i + " = " + (num*i) );
                     i++;
              }

       }
       
}
