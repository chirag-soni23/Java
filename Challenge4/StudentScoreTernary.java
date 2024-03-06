import java.util.Scanner;

public class StudentScoreTernary {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Student marks");
              System.out.print("Please, Enter a marks: ");
              int marks = input.nextInt();
              String result = marks > 80 ? "High" : (marks > 50 ? "Moderate": "Low");
              System.out.println("The result is: " + result);
       }
}
