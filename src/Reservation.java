/*
        attributes of guestCount, restaurantCapacity,isConfirmed
        constructor to initialize a reservation object
        to confirm reservation, create a method, check if the restaurant is open and has sufficient capacity,
        method to inform the user about the reservation status

*/

import java.sql.SQLOutput;

public class Reservation {
    //instance fields
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    //it's a constructor to initialize the reservation objects which
    //are the restaurants created in the main method
    public Reservation(int count, int capacity, boolean open){
        if (count < 1 || count > 8 ) {
            System.out.println("Invalid reservation");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }
 //I think ww have formal parameters because we need to initialize them, or change their value
    public void confirmReservation(){
        if (restaurantCapacity>=guestCount && isRestaurantOpen){
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        }
        else{
            System.out.println("Reservation not confirmed");
            isConfirmed = false;
        }
    }
   //functions are non-static, so they need to be called from an object
    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Unable, to confirm reservation");
        }
        else{
            System.out.println("enjoy your meal ");
        }
    }


    public static void main(String[] args) {
        //creating the restaurants

        Reservation res1 = new Reservation(7, 10, true);
        res1.confirmReservation();
        res1.informUser();

        Reservation res2 = new Reservation(9, 10, true);
            res2.informUser();
            res2.confirmReservation();
        Reservation res3 = new Reservation (8, 7, true);
             res3.confirmReservation();
             res3.informUser();
             Reservation res4 = new Reservation(6,8, false);
             res4.informUser();
             res4.confirmReservation();


    }


    }

