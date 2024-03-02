public class Reversearr {
       public static void main(String[] args) {
              System.out.println("Welcomr to Reverse array");
              int[] numArr = Arrayutility.inputArray();
              reverseArr(numArr);
              System.out.println("The reverse array is: ");
              Arrayutility.displayArr(numArr);

       }
       public static void reverseArr(int[] arr){
              int i = 0;
              while(i<arr.length/2){
                     int swap = arr[i];
                     arr[i] = arr[(arr.length-1) - i];
                     arr[(arr.length-1) - i] = swap;
                     i++;
              }

       }
}
