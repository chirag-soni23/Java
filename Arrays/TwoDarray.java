public class TwoDarray {
       public static void main(String[] args) {
              int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
              // System.out.println(arr.length);
              // 2d Array Travesal
              int i = 0;
              while(i<arr.length){
                     int j = 0;
                     while(j<arr.length){
                            // System.out.println(i + " and " + j);
                            System.out.print(arr[i][j] + " ");
                            j++;

                     }
                     i++;
              }
       }
       
}
