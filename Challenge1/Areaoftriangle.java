import java.util.Scanner;

public class Areaoftriangle {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.print("Welcome to formula of Area of a Triangle\n");
              System.out.print("Enter the base value of triangle: ");
              double base = input.nextDouble();
              System.out.print("Enter the height value of triangle: ");
              double height = input.nextDouble();

              double Areaoftriangle = 0.5 * base * height;
              System.out.print("Your answer is: " + Areaoftriangle);
       }
       
}
