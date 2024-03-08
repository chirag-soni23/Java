public class Mathclass{
       public static void main(String[] args) {
              System.out.println(Math.abs(-99));
              System.out.println(Math.ceil(3.09));
              System.out.println(Math.floor(3.09));
              System.out.println(Math.round(3.09));
              System.out.println(Math.random());
              System.out.println(Math.PI);

              for(int i = 0;i<=10;i++){
                     System.out.println("Random number " + Math.round(Math.random()*10+1));
              }
       }
}