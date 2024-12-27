/*
        attributes of guestCount, restaurantCapacity,isConfirmed
        constructor to initialize a reservation object
        to confirm reservation, create a method, check if the restaurant is open and has sufficient capacity,
        method to inform the user about the reservation status

*/

public class Reservation {
    //instance fields
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public static void main(String[] args) {

        }
        //constructor to initialize a Reservation object
    public Reservation(int count, int capacity, boolean open){
        //Validate guest count (must be between 1 and 8)
        if (count < 1 || count > 8){
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
        isConfirmed = open;
    }













    }

