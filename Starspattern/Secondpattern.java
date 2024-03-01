package Starspattern;

import java.util.Scanner;

public class Secondpattern {
       public static void main(String[] args) {
               try (Scanner input = new Scanner(System.in)) {
                     System.out.println("Welcome to second star pattern");
                     System.out.print("Please, Enter a rows: ");
                     int num = input.nextInt();
                     secondStarpattern(num);
              }
              
       }
       public static void secondStarpattern(int maxRows){
              int rows = maxRows;
              while(rows>0){
                     int i = 0;
                     while(i<rows){
                            System.out.print(" *");
                            i++;
                     }
                     System.out.println();
                     rows--;
              }
              
       }
       
}
