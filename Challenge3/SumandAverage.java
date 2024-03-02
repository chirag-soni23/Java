public class SumandAverage {
       public static void main(String[] args) {
              System.out.println("Welcome to sum and average");
              int[] numArr = Arrayutility.inputArray();
              long sum = sum(numArr);
              double average = average(numArr);
              System.out.println("The sum of element is: " + sum);
              System.out.println("The average of element is: " + average);

       }
       // Sum of Array
       public static long sum(int[] numArr){
              int i = 0;
              long sum = 0;
              while(i<numArr.length){
                     sum += numArr[i];
                     i++;

              }
              return sum;

       }
       // Average of Array
       public static double average(int[] numArr){
              double sum = sum(numArr);
              return sum / numArr.length;
       }
}
