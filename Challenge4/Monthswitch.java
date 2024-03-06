import java.util.Scanner;

public class Monthswitch {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Month name");
              System.out.print("Please enter your month in number: ");
              int monthnum = input.nextInt();
              String monthName = monthName(monthnum);
              System.out.println("The month name is: " + monthName);
       }
       public static String monthName(int monthNum){
              return switch (monthNum){
                     case 1 -> "Janauary";
                     case 2 -> "February";
                     case 3 -> "March";
                     case 4 -> "April";
                     case 5 -> "May";
                     case 6 -> "June";
                     case 7 -> "July";
                     case 8 -> "August";
                     case 9 -> "September";
                     case 10 -> "October";
                     case 11 -> "November";
                     case 12 -> "December";
                     default -> "Mars Month";
         
         
                 };
       }
}
