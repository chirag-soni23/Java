import java.util.Scanner;

public class DeleteArray {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              int[] numArr = Arrayutility.inputArray();
              System.out.print("Enter a number you want to delete: ");
              int numTodel = input.nextInt();
              int[] newArr = deleteNumber(numArr, numTodel);
              System.out.println("The new array is: ");
              Arrayutility.displayArr(newArr);
       }

       public static int[] deleteNumber(int[] numArr, int numtoDel) {
              int occ = NumberofOccurance.noOfOccurance(numArr, numtoDel);
              if (occ == 0) {
                     return numArr;
              }
              int newSize = numArr.length - occ;
              int[] newArr = new int[newSize];

              int i = 0, j = 0;
              while (i < numArr.length) {
                     if (numArr[i] != numtoDel) {
                            newArr[j] = numArr[i];
                            j++;

                     }
                     i++;
              }
              return newArr;

       }
}