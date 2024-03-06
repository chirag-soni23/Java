import java.util.Scanner;

public class SwitchCase {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to switch case");
              System.out.print("Enter your day in number: ");
              int day = input.nextInt();
              oldSwitch(day);

       }       

       public static void oldSwitch(int day){
              switch(day){
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
