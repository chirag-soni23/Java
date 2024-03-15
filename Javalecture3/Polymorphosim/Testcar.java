public class Testcar {
       public static void main(String[] args) {
              // Vehicle vehicle = new Vehicle();
              ClassCar car = new ClassCar();
              // Plane plane = new Plane();
              Vehicle vCar = new ClassCar();
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
              ClassCar cVehicle = (ClassCar) veh;
              System.out.println(cVehicle.noOfDoors());

       }
       
}
