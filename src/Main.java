import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {
          //code for removing odd numbers from a ArrayList
           ArrayList<Integer> first = new ArrayList<>(List.of(1,2,3,4,5,5,7,8,9,10,56,89));

           int i =0;      //i is the counter variable
            while ( i < first.size() ) {
                //if value is odd, remove it
                if (first.get(i) % 2 != 0) {
                    first.remove(i);
                } else {
                    //if value is even, increment counter
                    i++;
                }
            }
                //doing the same thing but now using a for loop
                for (int j =0; j < first.size(); j++ ){
                    if (first.get(j)%6 == 0) {
                        first.remove(j);
                        j--;
                    }
                }
                System.out.println(first);

                //interesting - to use indexOf but when we want to start searching from a particular
                 //index
                    String str = "hello world";
                    int index = str.indexOf('o', 5); // Start searching from index 5
                    System.out.println(index); // Output: 7


    }
}