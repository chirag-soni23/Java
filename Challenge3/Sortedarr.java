public class Sortedarr{
       public static void main(String[] args) {
              System.out.println("Welcome to sorted array");
              int[] numArr = Arrayutility.inputArray();
              boolean inc = increasing(numArr);
              boolean dec = decreasing(numArr);

              if(inc || dec){
                     System.out.println("Yes, Array is sorted");
              }
              else{
                     System.out.println("No, Array is not sorted");
              }
              



       }
       public static boolean increasing(int[] numArr){
              int i = 1;
              while (i<numArr.length) {
                     if(numArr[i] < numArr[i-1] ){
                     return false;
                     }
                     i++;
                     
              }
              return true;
              
       }
       public static boolean decreasing(int[] numArr){
              int i = 1;
              while (i<numArr.length) {
                     if(numArr[i] > numArr[i-1] ){
                     return false;
                     }
                     i++;
                     
              }
              return true;
              
       }

}