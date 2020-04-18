package collectionsReview;

import java.util.*;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Czarina", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mars", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);


//        Theatre midway = new Theatre("Midway",8, 12);
//
//        if(midway.reserveSeat("A02")){
//            System.out.println("Please pay for A02");
//        } else {
//            System.out.println("Seat already taken");
//        }
//
//        if(midway.reserveSeat("A02")){
//            System.out.println("Please pay for A02");
//        } else {
//            System.out.println("Seat already taken");
//        }
//
//        if(midway.reserveSeat("B13")){
//            System.out.println("Please pay for B13");
//        } else {
//            System.out.println("Seat already taken");
//        }
//
//        List<Theatre.Seat> reverseSeats = new ArrayList<>(midway.getSeats());
//        Collections.reverse(reverseSeats);
//        printList(reverseSeats);
//
//        List<Theatre.Seat> priceSeats = new ArrayList<>(midway.getSeats());
//        priceSeats.add(midway.new Seat("B00", 13.00));
//        priceSeats.add(midway.new Seat("A00", 13.00));
//        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
//        printList(priceSeats);
//
//
//        System.out.println(" Henlo");



    }

//    public static void printList(List<Theatre.Seat> list) {
//        list.forEach(s -> System.out.println(s.getSeatNumber() + " $" + s.getPrice()));
//        System.out.println();
//        System.out.println("=====================================================================================");
//    }

}
