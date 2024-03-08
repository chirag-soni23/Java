public class Evennum {
       public static void main(String[] args) {
              System.out.println("Welcome to Even number");
              int num = 100;
              for(int i = 1;i<=num;i++){
                     if(i % 2 != 0){
                            continue;
                     }
                     else{
                            System.out.println("The even number is " + i);
                     }
              }
       
       }
}
