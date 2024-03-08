import java.util.Scanner;
public class FibonacciRecrusion {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
       Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series");
        System.out.print("Please, Enter the of elements to be printed: ");
        int count = input.nextInt();
        for (int i = 1;i<= count;i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int position){
        if(position == 1){
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}