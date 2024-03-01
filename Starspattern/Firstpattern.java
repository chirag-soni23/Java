package Starspattern;

import java.util.Scanner;

public class Firstpattern{
       public static void main(String[] args) {
              try (Scanner input = new Scanner(System.in)) {
                     System.out.println("Welcome to first star pattern");
                     System.out.print("Please, Enter a rows: ");
                     int num = input.nextInt();
                     firstStarpattern(num);
              }


              
       }
       public static void firstStarpattern(int maxRows){
              int rows = 0;
              while(rows<maxRows){
                     System.out.print("*");
                     int i = 0;
                     while(i < rows){
                            System.out.print(" *");
                            i++;
                     }
                     System.out.println();
                     rows++;
              }
              


       }
}