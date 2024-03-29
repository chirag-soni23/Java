import java.util.Scanner;

public class ParameterofRect {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.print("Welcome to formula of Parameter of rectangle\n");
              System.out.print("Enter the side of length1: ");
              float A = input.nextFloat();
              System.out.print("Enter the side of length1: ");
              float B = input.nextFloat();
              System.out.print("Enter the side of width1: ");
              float C = input.nextFloat();
              System.out.print("Enter the side of width2: ");
              float D = input.nextFloat();

              float ParameterofRectangle = A + B + C + D;
              System.out.print("Result is: " + ParameterofRectangle);




       }

       
       
}
