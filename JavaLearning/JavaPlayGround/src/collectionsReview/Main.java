package collectionsReview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre midway = new Theatre("Midway",8, 12);

        if(midway.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already taken");
        }

        if(midway.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already taken");
        }

        if(midway.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already taken");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(midway.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(midway.getSeats());
        priceSeats.add(midway.new Seat("B00", 13.00));
        priceSeats.add(midway.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);


        System.out.println(" Henlo");



    }

    public static void printList(List<Theatre.Seat> list) {
        list.forEach(s -> System.out.println(s.getSeatNumber() + " $" + s.getPrice()));
        System.out.println();
        System.out.println("=====================================================================================");
    }

}
