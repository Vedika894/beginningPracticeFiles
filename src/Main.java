import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     /*
     for each loop - traversing technique to iterate through the elements
     in an array/collection    , less step , more readable
     less flexible
      */
  String[] animals = {"cat", "dog", "rat", "bird"};
  ArrayList<String> hobbies = new ArrayList<>();

  hobbies.add("swimming");
  hobbies.add("eat");
  hobbies.add("reading");


  //for loop structure
        //the data type, then variable, then colon, list the Array Name
        //any collection
  for(String i : animals ){
      System.out.println(i);
  }
     for (String j : hobbies){
         System.out.println(j);
     }

    }
}          //useful for iterating through all the elements of an collection
//less flexible than a standard for loop