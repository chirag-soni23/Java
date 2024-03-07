public class Maxnumber {
       public static void main(String[] args) {
              System.out.println("Welcome to Maximum Number");
              int[] numArr = { 20, 45, 77, 83, 22, 33, 12, 66 };
              int max = maximum(numArr);
              System.out.println("The maximum number is " + max);
       }

       public static int maximum(int[] numArr) {
              int max = Integer.MIN_VALUE;
              for (int i : numArr) {
                     if (max < i) {
                            max = i;
                     }
              }
              return max;
       }
}
