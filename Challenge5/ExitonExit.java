import java.util.Scanner;

public class ExitonExit {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Exit on Exit");
              while(true){
                     System.out.print("Enter a Command: ");
                     String cmd = input.next();
                     if(cmd.equals("exit")){
                            break;
                     }
              }
              System.out.println("You have succesfully Exit");
       }
}
