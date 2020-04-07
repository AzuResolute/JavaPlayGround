package collectionsReview;

public class Main {
    public static void main(String[] args) {
        Theatre midway = new Theatre("Midway",4, 3);
        midway.getSeats();

        if(midway.reserveSeat("D03")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if(midway.reserveSeat("D03")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
