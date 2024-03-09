public class StringFormat{
       public static void main(String[] args) {
              String name = "Kartik";
              int number = 123345;
              System.out.println("Hello " + name + " your number is " + number);
              System.out.printf("Hello %s your number is %d",name,number);
              System.out.println();
              System.out.printf("Hello %S your number is %d",name,number);
              System.out.printf("Hello %S your number is %0,5d",name,number);
              
              
       }
       
}