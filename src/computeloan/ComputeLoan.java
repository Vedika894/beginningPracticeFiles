/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computeloan;
import java.util.Scanner;
/**
 *
 * @author Vedika
 */
public class ComputeLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the annual interest rate in percentage: ");
        Double AnnualRate = input.nextDouble();

        //calculate monthly interest rate
        Double MonthlyRate = AnnualRate/1200;    //dividing by 100 to convert percentage to decimal


        //ask for the number of years from the user

        System.out.print("Number of years: ");
        Double Years = input.nextDouble();

        //ask for the loan amount

        System.out.print("The loan amount : ");
        Double Amount = input.nextDouble();

        //calcualte the montly payment

        Double MonthlyPayement = ((Amount * MonthlyRate)/1)/
                1- 1/(Math.pow(1+MonthlyRate, Years*12));

        //calcualte total payement
        Double TotalPayement = MonthlyPayement*Years * 12;

        System.out.println("The montly payement is : "+ (int) (MonthlyPayement*100)/100+"\n the total payement is: "+ (int)(TotalPayement*100)/100);
    }

}
