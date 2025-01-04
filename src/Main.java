import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
 public static void main (String[] args){
     //we are looping through the array from the last index to the first index (0)
     //On each iteration, we print the element at the current index i in reverse order
     String[] words = {"one", "two", "three", "four", "five"};

     //loop trough the array in reverse order and print the elements
     for ( int i = words.length -1; i >=0 ; i--){
         System.out.println(words[i]);



         //didn;t learn stacks yet

         //do the same thing, but using another
         //method
         String[] words2 = {"one", "two", "three", "four"};

         //creating a stack to hold the words
         Stack<String> stack = new Stack<>();

         //push all the words into the stack
         for ( String j : words2){
             stack.push(j);
         }
       //pop and print each form the stack ( in reverse order)
         while (!stack.isEmpty()){
             System.out.println(stack.pop());
         }
     }
   }
}
