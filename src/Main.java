import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Double[] numbers = {1.5, 2.3, 3.7, 4.8, 5.0};
         double sum =0;   //sum is initiated outside of the loop, so it lets us
        //calculate the sum of all the elements

        for (double v : numbers) {
              sum += v;
            }
        System.out.println(sum);  //prints after the loop finishes

        }
    }

// to print the sum of the element in the array
