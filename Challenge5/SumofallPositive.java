public class SumofallPositive {
       public static void main(String[] args) {
              System.out.println("The sum of all Positive numbers");
              int[] numArr = Arrayutility.inputArray();
              int sum = 0;
              for (int nums : numArr) {
                     if (nums < 0) {
                            continue;
                     }
                     sum += nums;
              }
              System.out.println("The sum of positive number is " + sum);
       }

}
