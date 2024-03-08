import java.util.Scanner;
public class Numberofocc{
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Number of ccurances");
              int[] numArr = Arrayutility.inputArray();
              System.out.println("Please, Enter your number: ");
              int num = input.nextInt();
              int isFound = isFound(numArr, num);
              System.out.println("The number of occurance is " + isFound);
       
       }

       public static int isFound(int[] numArr, int num){
              int occ = 0;
              for (int nums : numArr) {
                     if(nums == num){
                            occ++;
                     }   
              }
              return occ;

       } 
}