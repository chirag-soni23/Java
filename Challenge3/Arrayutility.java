import java.util.Scanner;

public class Arrayutility{
       public static int[] inputArray(){
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Please, Enter the number of elements: ");
              int size = input.nextInt();
              int[] nums = new int[size];
              int i = 0;
              while(i<size){
                     System.out.println("Please enter the element no. " + (i+1) + " : ");
                     nums[i] = input.nextInt();
                     i++;
              } 
              return nums;

       }
}