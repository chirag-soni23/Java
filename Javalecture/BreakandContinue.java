public class BreakandContinue {
       public static void main(String[] args) {
              // Break Statement
              // System.out.println("Before the loop");
              // for(int i = 1; i<=10;i++){
              //        if(i==5){
              //               break;
              //        }
              //        System.out.println(i);
              // }
              // System.out.println("Out of loop");




              // Continue Statment
              System.out.println("Before the loop");
              for(int i = 1; i<=10;i++){
                     if(i==5){
                            continue;
                     }
                     System.out.println(i);
              }
              System.out.println("Out of loop");
       }
}
