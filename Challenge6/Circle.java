package Challenge6;

import java.util.Scanner;

public class Circle {
       double radius;

       public Circle(double radius) {
              this.radius = radius;
       }

       double getCircumference() {
              return 2 * Math.PI * radius;
       }

       double getArea() {
              return Math.PI * Math.pow(radius, 2);
       }

       @Override
       public String toString() {
              return "Circle: Area of circle is: " + Math.floor(getArea()) + 
             ", Circumference of circle is: " + Math.floor(getCircumference()) + " ";
       }

       @SuppressWarnings("resource")
       public static void main(String[] args) {
              System.out.println("Welcome to Circle World");
              System.out.print("Please, Enter a radius: ");
              Scanner input = new Scanner(System.in);
              double radius = input.nextDouble();
              Circle circle = new Circle(radius);
              System.out.println(circle);
       }

}
