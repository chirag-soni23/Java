import java.util.Scanner;

public class ArraySearching {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
              System.out.println("Welcome to Array Searching number");
              System.out.print("Please, Enter a number for a given arr: ");
              int num = input.nextInt();
              boolean isFound = isFound(arr, num);
              if (isFound) {
                     System.out.println("Yes, number is in given array.");
              } else {
                     System.out.println("No, number it is not given array.");

              }

       }

       public static boolean isFound(int[] arr, int num) {
              int i = 0;
              while(i < arr.length) {
                     if (arr[i] == num) {
                            return true;
                     }
                     i++;

              }
              return false;

       }
}
