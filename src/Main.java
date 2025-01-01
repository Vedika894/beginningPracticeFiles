//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
   public static void main (String[] args){
       String[] students = {"Sade" , "Alexus", "Sam ", "Koma"};
       int[] mathScores = new int[4];


       mathScores[0] = 64;
       mathScores[2] = 76;
       mathScores[1] = 57;
       mathScores[3] = 98;

       //for loop to illiterate over the indexes
       for (int i = 0; i < students.length; i++){
           System.out.println( students[i]+ " : "+ mathScores[i]);
       }
    }
}