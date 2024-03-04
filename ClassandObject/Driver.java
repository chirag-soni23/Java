public class Driver {
       public static void main(String[] args) {
             Car myCar = new Car();
             myCar.drive();
             System.out.println(myCar.getCurrentfuelIncar());
             myCar.addFuel(4);
             myCar.drive();
             myCar.drive();
             myCar.drive();
             System.out.println(myCar.getCurrentfuelIncar());
             
       }
       
}
