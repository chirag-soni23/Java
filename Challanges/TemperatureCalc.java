import java.util.Scanner;

public class TemperatureCalc {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new  Scanner(System.in);
              System.out.print("Welcome to Temperature Calculator\n");
              System.out.print("Enter the temperature in Farhenite degree: ");
              double fah = input.nextDouble();
              double cel = Math.floor((fah - 32) * 5/9);
              System.out.println("Your temperature in celsius " + cel);

       }
              
}
