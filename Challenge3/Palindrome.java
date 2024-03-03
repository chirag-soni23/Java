public class Palindrome {
       public static void main(String[] args) {
              System.out.println("Welcome to Palindrome number");
              int[] numArr = Arrayutility.inputArray();
              boolean isPalin = ispalindrome(numArr);
              if(isPalin){
                     System.out.println("Your array is palindrome");
              }
              else{
                     System.out.println("Your array is not palindrome");

              }
       }  
       public static boolean ispalindrome(int[] arr){
              int i = 0;
              while(i<arr.length/2){
                     if(arr[i] != arr[(arr.length-1) - i]){
                            return false;
                     }
                     i++;
              }
              return true;
              
       }
}
