public class Train {
       int maxSpeed;
       int coach;
       int trainNumber;
       String name;
       String color;

       public Train(int maxSpeed, int coach, int trainNumber, String name, String color) {
              this.maxSpeed = maxSpeed;
              this.coach = coach;
              this.trainNumber = trainNumber;
              this.name = name;
              this.color = color;
       }

       // toString method
       @Override
       public String toString() {
              return "Train [maxSpeed=" + maxSpeed + ", coach=" + coach + ", trainNumber=" + trainNumber + ", name="
                            + name + ", color=" + color + "]";
       }
       

       

       public static void main(String[] args) {
              Train train = new Train(180, 10, 12461, "Vande Bharat", "White");
              System.out.println(train.toString());
       }
}
