/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Vedika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rolling;
        int numbers;

        //for loop
        for (rolling=1;rolling<6; rolling++){
            numbers= (int)(Math.random()*6+1);

            if(rolling==5){
                System.out.print(numbers);

            }else{
                System.out.print(numbers+"  , ");
            }

        }

    }
}


