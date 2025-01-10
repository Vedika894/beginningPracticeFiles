import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter 2 numbers separated by space: ");
        String Strnum1 = input.next();
        String Strnum2 = input.next();

        //transform them into Strings
        double num1 = Double.parseDouble(Strnum1);
        double num2 = Double.parseDouble(Strnum2);

        System.out.println("please enter the operator  ( *, +, or -): ");
        String character = input.next();

        System.out.println("Enter a formula : (ex. num1 oper num2 with spaces) ");
        String formula = input.nextLine();

        System.out.println(calcResult(num1, num2));
        System.out.println(calcResult(num1 ,num2, character));
        System.out.println(calcResult(formula));

    }


    public static double calcResult(double num1, double num2) {
        return num1 + num2;

    }

    public static double calcResult(double num1, double num2, String oper) {
        int answer = 0;
        if (oper == "*") {
            answer = (int) (num2 * num1);
        }
        if (oper == "+") {
            answer = (int) (num1 * num2);
        }
        if (oper == "-")
            answer = (int) (num1 - num2);
        if (oper == "/") {
            answer = (int) (num1 / num2);
        }
        return answer;
    }

    public static double calcResult(String formulaa){
        int answer = 0;
        char Charnum1 = formulaa.charAt(0,1);
        char Charoper  = formulaa.charAt(3);
        char Charnum2 = formulaa.charAt(5);

        int num1 = Integer.parseInt(String.valueOf(Charnum1));
       // int chara = Integer.parseInt(String.valueOf(Charoper));
        int num2 = Integer.parseInt(String.valueOf(Charnum2));

        switch (Charoper){
            case 1:
                Charoper = '*';
                answer = num1 * num2;
                break;
            case 2:
                Charoper = '/';
                answer = num1 / num2;

            case 3:
                Charoper = '+';
                answer = num1 + num2;
            case 4 :
                Charoper = '-';
                answer = num1 - num2;
        }

        return answer;
    }
}

