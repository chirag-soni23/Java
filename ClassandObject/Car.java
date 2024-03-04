public class Car{
      int noOfWheels;
      String color;
      float currentFuelinLitre;
      int maxSpeed;
      int noOfseats;

      public void drive(){
       if(currentFuelinLitre == 0){
              System.out.println("Car is out of fuel");
       }
       else if(currentFuelinLitre < 5){
              System.out.println("Car is in reserved mode, please refuel");
              currentFuelinLitre--;

       }
       else{
              System.out.println("Car is  driving");
              currentFuelinLitre--;
       }

      }

      public float addFuel(float fuel){
       return currentFuelinLitre += fuel;
      }

      public float getCurrentfuelIncar(){
              return currentFuelinLitre;
      }
}


