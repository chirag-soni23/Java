import java.util.Scanner;

public class Search2DArray {
       public static void main(String[] args) {
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to 2D  search");
              int[][] numArr = Arrayutility.input2DArray();
              System.out.print("Now, Enter a number you want to search: ");
              int num = input.nextInt();
              boolean isFound = search(numArr,num);
              if(isFound){
                  System.out.println("Yes, your number was found");
              }
              else{
                  System.out.println("No, your number was not found");
              }
      
          }
          public static boolean search(int[][] numArr,int num){
              int i = 0;
              while(i<numArr.length){
                  int j = 0;
                  while (j<numArr[i].length){
                      if(numArr[i][j] == num){
                          return true;
                      }
                      j++;
                  }
                  i++;
              }
              return false;
      
          }

}
