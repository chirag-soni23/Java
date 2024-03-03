import java.util.Scanner;

public class Arrayutility{
       public static int[] inputArray(){
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.print("Please, Enter the number of elements: ");
              int size = input.nextInt();
              int[] nums = new int[size];
              int i = 0;
              while(i<size){
                     System.out.print("Please enter the element no. " + (i+1) + " : ");
                     nums[i] = input.nextInt();
                     i++;
              } 
              return nums;

       }

       public static int[][] input2DArray(){
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Please, Enter a row: ");
              int row = input.nextInt();
              System.out.println("Please, Enter a column: ");
              int column = input.nextInt();
              int[][] numArr = new int[row][column];
              int i = 0;
              while(i<row){
                     int j = 0;
                     while (i<column) {
                            System.out.print("Please enter element roes : " + (i + 1) + ",  column: "  + (j+1) + " : ");
                            j++;
                            
                     }
                     i++;
              }
              return numArr;
       }

       public static void displayArr(int[] numArr){
              int i = 0;
              while(i<numArr.length){
                     System.out.println(numArr[i] + " ");
                     i++;
                     
              }
              System.out.println();
       }
}