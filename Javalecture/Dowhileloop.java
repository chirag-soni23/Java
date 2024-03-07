import java.util.Scanner;

public class Dowhileloop{
       public static void main(String[] args) {
              @SuppressWarnings("resource")
               Scanner input = new Scanner(System.in);
              // System.out.print("Please enter your age: ");
              // int age = input.nextInt();
              // while(age<0||age>100){
              //        System.out.print("Please enter your age: ");
              //         age = input.nextInt();
              // }
              // System.out.println("Your age is: " + age);



              // Do while loop
              int age;
              do{
                     System.out.print("Please, Enter your age: ");
                     age = input.nextInt();
              }
              while(age<0||age>100);
              System.out.println("Your age is: " + age);
              
       }
}