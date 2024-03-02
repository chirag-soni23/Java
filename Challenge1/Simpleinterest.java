import java.util.Scanner;

public class Simpleinterest {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              System.out.print("Welcome to simple interest\n");
              Scanner input = new Scanner(System.in);
              System.out.print("Enter Principle Value: ");
              double principle = input.nextDouble();
              System.out.print("Enter the rate of interest: ");
              double rate =  input.nextDouble();
              System.out.print("Enter the interest timing: ");
              double time = input.nextDouble();
              

              double Simpleinterest = (principle * rate * time)/ 100;

              System.out.println("The result of S.I. is: " + Simpleinterest);



              
       }
       
}
