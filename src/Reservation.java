/*
        attributes of guestCount, restaurantCapacity,isConfirmed
        constructor to initialize a reservation object
        to confirm reservation, create a method, check if the restaurant is open and has sufficient capacity,
        method to inform the user about the reservation status

*/

import java.sql.SQLOutput;

public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    String restaurantName;


// the constructor has no return value, not even void
    public Reservation( int count, int capacity, boolean open, String name){
      if(count<1 || count>8){
          System.out.println("valid reservation for " +name);
      }
      else{
          System.out.println("invalid reservation \n");
      }
      guestCount = count;
      restaurantCapacity = capacity;
      isRestaurantOpen = open;
      restaurantName = name;
    }
    public void confirmReservation(){
        if(isRestaurantOpen&& guestCount <= restaurantCapacity){
            System.out.println(" reservation confirmed for" +  restaurantName);
            isConfirmed = true;
        }
        else{
            System.out.println("Reservation denied" + restaurantName);
            isConfirmed = false;
        }
    }

    public void informUser() {
        if (isConfirmed) {
            System.out.println("enjoy your meal!" +  restaurantName);
        } else {
            System.out.println("unable to confirm" + restaurantName);
        }
    }
    public static void main(String[] args) {
      Reservation res1 = new Reservation(5,10, true,"NUMBER1" );
      res1.confirmReservation();
      res1.informUser();

      Reservation res2 = new Reservation(9, 10, true, "NUMBER2");
      res2.confirmReservation();
      res2.informUser();

      Reservation res3 = new Reservation (7, 11, false, "NUMBER3");
          res3.confirmReservation();
          res3.informUser();
      Reservation res4 = new Reservation(6, 5, true, "NUMBER4");
      res4.confirmReservation();
      res4.informUser();

    }


    }

