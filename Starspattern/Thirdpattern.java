package Starspattern;

import java.util.Scanner;

public class Thirdpattern {
       public static void main(String[] args) {
               try (Scanner input = new Scanner(System.in)) {
                     System.out.println("Welcome to third star pattern");
                     System.out.print("Please, Enter a rows: ");
                     int num = input.nextInt();
                     thirdStarpattern(num);
              }
       }
       public static void thirdStarpattern(int maxRows){
              int rows = maxRows;
              while(rows>0){
                     int j = 0;
                     while(j<rows){
                            System.out.print("  ");
                            j++;
                     }
                     int i = 0;
                     while(i<= (maxRows - rows)){
                            System.out.print("* ");
                            i++;
                     }
                     System.out.println();
                     rows--;
              }
             
             

       }
}
