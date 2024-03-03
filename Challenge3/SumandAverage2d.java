public class SumandAverage2d {
       public static void main(String[] args) {
              System.out.println("Welcome to Sum and average of 2D array");
              int[][] numArr = Arrayutility.input2DArray();
              long sum = sum(numArr);
              double average = average(numArr);
              System.out.println("The sum of 2D array is " + sum);
              System.out.println("The average of 2D array is " + average);
       }
       public static long sum(int[][] numArr){
              long sum = 0;
              int i = 0;
              while (i<numArr.length){
                     int j = 0;
                     while(i<numArr[i].length){
                            sum += numArr[i][j];
                            j++;
                     }
                     i++;
                     
              }
              return sum;

       }
       public static double average(int[][] numArr){
              if(numArr.length==0){
                     return 0;
              }
              int rows = numArr.length;
              int cols = numArr[0].length;
              double size = rows * cols;
              return sum(numArr) / size;

       }
}
