public class MergetwosortedArr {
       public static void main(String[] args) {
              System.out.println("Welcome to merge sorted array");
              int[] arr1 = Arrayutility.inputArray();
              int[] arr2 = Arrayutility.inputArray();
              int[] Mergetwoarr = merge(arr1, arr2);
              System.out.println("The merge two sorted array here is");
              Arrayutility.displayArr(Mergetwoarr);
       }

       public static int[] merge(int[] arr1, int[] arr2) {
              int newSize = arr1.length + arr2.length;
              int[] newArr = new int[newSize];
              int i = 0, j = 0, k = 0;
              while (i < arr1.length || j < arr2.length) {
                     if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[i])) {
                            newArr[k] = arr1[i];
                            i++;
                            k++;
                     } else {
                            newArr[k] = arr2[j];
                            j++;
                            k++;
                     }

              }
              return newArr;

       }
}
