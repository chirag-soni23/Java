public class Sumofdiagonal {
       public static void main(String[] args) {
              System.out.println("Welcome to sum of diagonal in 2d array");
              int[][] numArr = Arrayutility.input2DArray();
              long sum = sumofdiagonals(numArr);
              System.out.println("Sum of diagonals is: " + sum);

       }

       public static long  sumofdiagonals(int[][] numArr){
              long leftSum = sumofLeftdiagonal(numArr);
              long rightSum = sumofRightdiagonal(numArr);
              long Totalsum = leftSum + rightSum;
              if(numArr.length % 2 !=0){
                     int idx = numArr.length / 2;
                     Totalsum -= numArr[idx][idx];
                     
              }
              return Totalsum;
              
       }
       public static long  sumofLeftdiagonal(int[][] numArr){
              long sum = 0;
              int i = 0;
              while(i<numArr.length){
                     sum += numArr[i][i];
                     i++;
              }
              return sum;

       }
       public static long  sumofRightdiagonal(int[][] numArr){
              long sum = 0;
              int i = 0;
              while (i<numArr.length) {
                     int cols = (numArr.length - 1) - i;
                     sum += numArr[i][cols];
                     i++;
                     
              }
              return sum;

       }
       
}
