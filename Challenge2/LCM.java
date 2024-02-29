import java.util.Scanner;

public class LCM {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Least common multiple");
              System.out.print("Enter the first number: ");
              int first = input.nextInt();
              System.out.print("Enter the second number: ");
              int second = input.nextInt();
              int lcm = lcm(first, second);
              System.out.println("The lcm of two number is : " +  lcm);
       }

       public static int lcm(int first , int second){

              int i = 1;
              while(i <= second){
                    
                     if((first * i) % second == 0){
                            return first * i;
                     }
                     i++;
              }
              return 0;
       }
       
}
