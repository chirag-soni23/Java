public class MinMaxArr {
       public static void main(String[] args) {
              System.out.println("Welcome to min and max array");
              int[] numArr = Arrayutility.inputArray();
              int max = maxValue(numArr);
              int min = minValue(numArr);
              System.out.println("The Maximum Value is: " + max);
              System.out.println("The Minimum Value is: " + min);
       }

       // Max Value
       public static int maxValue(int[] numArr) {
              if (numArr.length == 0) {
                     return Integer.MIN_VALUE;
              }
              int max = numArr[0];
              int i = 1;
              while (i < numArr.length) {
                     if (max < numArr[i]) {
                            max = numArr[i];

                     }
                     i++;
              }
              return max;

       }

       // Min Value
       public static int minValue(int[] numArr) {
              int min = Integer.MAX_VALUE;
              int i = 0;
              while (i < numArr.length) {
                     if (min > numArr[i]) {
                            min = numArr[i];
                     }
                     i++;
              }
              return min;

       }
}