import java.util.Scanner;

public class NumberofOccurance {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Number of occurances");
              int[] numArr = Arrayutility.inputArray();
              System.out.print("Now enter a value you want to find: ");
              int num = input.nextInt();
              int occurance = noOfOccurance(numArr,num);
              System.out.println("The number of occurance are found in " + occurance);
       }
       public static int noOfOccurance(int[] numArr,int num){
              int occ = 0;
              int i = 0;
              while(i<numArr.length){
                     if(numArr[i] == num){
                            occ++;
                     }
                     i++;


              }
              return occ;

       }

}
