import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 2 numbers separated by space: ");
        double num1 = scanner.nextDouble();    //first number
        double num2 = scanner.nextDouble();    //second number
        double firstNumber = calcResult(num1, num2);   //calling the method

        System.out.println("please enter the operator  ( *, +, or -): ");
        scanner.nextLine(); //skip the line to avoid overlap from the previous user input
        char oper = scanner.nextLine().charAt(0);
        double secondMethodResult = calcResult(num1, num2, oper);

        System.out.println("Enter a formula : (ex. num1 oper num2 with spaces) ");
        double thirdMethodResult = calcResult (scanner.nextLine());

        System.out.printf("%-26s :  %2f%n", " Calling the first method", firstNumber);
        System.out.printf("%-26s : %2f%n", "Calling the second method",secondMethodResult);
        System.out.printf("%-26s : %2f%n", "Calling the third method",thirdMethodResult);

    }


    public static double calcResult(double num1, double num2) {
        return num1 + num2;
    }

    public static double calcResult(double num1, double num2, char oper) {
        double answer = 0;

        return switch (oper) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case  '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;

        };
    }

    public static double calcResult(String formula){
       int firstIndexSpace = formula.indexOf(' ');
         double num1 = Double.parseDouble(formula.substring(0, firstIndexSpace)); //first number is before the first space
         char  oper = (formula.charAt(firstIndexSpace +1));//operator is after the firstSpace
        double num2 = Double.parseDouble(formula.substring(firstIndexSpace +2)); //after the first space and the operator

        return calcResult (num1, num2, oper);   //calling the second method and returning it too


    }
}

