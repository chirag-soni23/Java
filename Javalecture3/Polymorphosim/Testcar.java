public class Testcar {
       public static void main(String[] args) {
              // Vehicle vehicle = new Vehicle();
              Car car = new Car();
              // Plane plane = new Plane();
              Vehicle vCar = new Car();
              // castTest(plane);
              // castTest(vehicle);
              // castTest(car);
              // castTest(plane);
              castTest(car);
              castTest(vCar);
              
                     
       }
       private static void castTest(Vehicle veh){
              veh.start();
              // Car car = new Car();
              // car.start();
              Car cVehicle = (Car) veh;
              System.out.println(cVehicle.noOfDoors());

       }
       
}
