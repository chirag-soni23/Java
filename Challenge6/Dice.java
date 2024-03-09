package Challenge6;

public class Dice {
       int roll(){
              double random = Math.random() * 6 + 1;
              return (int)Math.round(random);
       }
       public static void main(String[] args) {
              Dice dice = new Dice();
              for(int i = 1;i<=10;i++){
                     System.out.println(dice.roll());

              }
       }
}
