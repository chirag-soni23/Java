public class Array{
       public static void main(String[] args) {
              System.out.println("Welcome to the array");
              int[] myArr = {1,2,3,4,5,6,7,8,9,10};
              // System.out.println(myArr[0]);
              // System.out.println(myArr.length);

              // Array Travesal
              int i = 0;
              while(i < myArr.length){
                     System.out.print(myArr[i] + " ");
                     i++;

              }


              // Array string
              String[] myArrstr = {"My", "Name", "Chirag", "Soni"};
              System.out.println(myArrstr[0]);


       }
}