import java.util.Scanner;
public class CheckPrimenumber {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to prime number");
              System.out.print("Please, Enter a number: ");
              int num = input.nextInt();
              boolean primenum = primenumber(num);
              System.out.println("The result is : " +  primenum);
       }  
       public static boolean primenumber(int num){
              int i = 2;
              while(i < num){
                     if(num % i == 0){
                            return false;
                     }
                     i++;
              }
              return true;
       }     
}
