package Challenge6;

public class Student {
       String name;
       int age;
       int rollNumber;

       public Student(String name, int age, int rollNumber) {
              this.name = name;
              this.age = age;
              this.rollNumber = rollNumber;
       }

       @Override
       public String toString() {
              return "Student Details: {name: " + name + ", age: " + age+ ", rollNumber: "+ rollNumber + "}";
       }
       public static void main(String[] args) {
              Student student = new Student("Chirag",19,2657861);
              System.out.println(student);
       }
       
}
