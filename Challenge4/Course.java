package Challenge4;

class Course {
       static int maxCapacity = 100;
       String courseName;
       int enrollments;
       String[] enrollStudents = new String[maxCapacity];

       Course(String courseName){
              this.courseName = courseName;
              this.enrollments = 0;
       }

       static void setMaxCapacity(int capacity){
              maxCapacity = capacity;
       }

       

       void enrollStudent(String studentName){
              if(enrollments<maxCapacity){
                     enrollStudents[enrollments] = studentName;
                     enrollments++; 
                     System.out.println(studentName + " is a buy " + this.courseName + " course");
              }
              else{
                     System.out.println("Sorry, Max capacity of students reached out.");
              }
       }

       void unenrollStudent(String studentName){
              int i = 0;
              while (i<enrollments) {
                     if(enrollStudents[i]==studentName){
                            enrollments--;
                            
                     }
                    
                     i++;
              }
              System.out.println(studentName + " is removed the " + this.courseName + " course");
       }

       public static void main(String[] args) {
              Course javaCourse = new Course("Java");
              Course pythonCourse = new Course("Python");
              javaCourse.enrollStudent("Chirag");
              javaCourse.enrollStudent("Indrapal");
              javaCourse.unenrollStudent("Indrapal");
              javaCourse.enrollStudent("Simran");
              pythonCourse.enrollStudent("Abhishek");

              // Courses enrollements
              System.out.println("Total students enrolled in java course " + javaCourse.enrollments);
              System.out.println("Total students enrolled in python course " + pythonCourse.enrollments);


       }
}

