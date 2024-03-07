public class ForEachloop {
       public static void main(String[] args) {
              String[] array = new String[]{
                     "Ram","Geeta","Sita","Mohan","Vikas"
              };
              printArray(array);
       }

       // For loop
       // public static void printArray(String[] names){
       //        for(int i = 0; i<names.length;i++){
       //               System.out.println(names[i]);
       //        }

       // }

       // For Each loop
       public static void printArray(String[] names){
              for(String allnames: names){
                     System.out.println(allnames);

              }
       }

}
