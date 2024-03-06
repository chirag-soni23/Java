import java.util.Scanner;

public class SwitchCase {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to switch case");
              System.out.print("Enter your day in number: ");
              int day = input.nextInt();
              // oldSwitch(day);
              newSwitch(day);

       }

       // New switch case.
       public static void newSwitch(int day) {
              String output = switch (day) {
                     case 1 -> "Monday";
                     case 2 -> "Tuesday";
                     case 3 -> "Wednesday";
                     case 4 -> "Thrusday";
                     case 5 -> "Friday";
                     case 6 -> "Saturday";
                     case 7 -> "Sunday";
                     default -> "Invalid days";
              };
              System.out.println(output);
       }

       // Old switch case.
       public static void oldSwitch(int day) {
              switch (day) {
                     case 1:
                            System.out.println("Monday");
                            break;
                     case 2:
                            System.out.println("Tuesday");
                            break;
                     case 3:
                            System.out.println("Wednesday");
                            break;
                     case 4:
                            System.out.println("Thrusday");
                            break;
                     case 5:
                            System.out.println("Friday");
                            break;
                     case 6:
                            System.out.println("Saturday");
                            break;
                     case 7:
                            System.out.println("Sunday");
                            break;
                     default:
                            System.out.println("Invalid days");
                            break;
              }

       }

}
