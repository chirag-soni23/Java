package Challenge6;
public class ArraytoString{
       public static void main(String[] args) {
              String[] arr = new String[] {"Hello","Guys","How","are","you."};
              StringBuilder str = new StringBuilder();
              for (String string : arr) {
                     str.append(string).append(" ");   
              }
              System.out.println(str);
       }
}