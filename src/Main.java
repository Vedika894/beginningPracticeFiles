import java.sql.SQLOutput;

//need to understand the nested if statement and while loop
public class Main {
    public static void main(String[] args) {
        System.out.println("the first 50 prime numbers are:\n");
        print(50);
    }
    public static void print(int numberOfPrimes){
        int number=2;
        int count =0;
        final int PRIMES_PER_LINE=10;

        while(count<numberOfPrimes){
            if(isPrime(number)){
                count++;

            if(count%PRIMES_PER_LINE==0) {
                System.out.printf("%-5d \n", number);
            } else
                System.out.printf("%-5d", number);
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        for(int divisor=2; divisor<=number/2; divisor++){
            if(number%divisor==0){
                return false;
            }
        }
        return true;
    }
}