import java.lang.management.MonitorInfo;

public class TimB {

    public static void main(String[] args) {

        // Begin Composition
        Dimensions dim = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell", "2400", dim);
        Monitor theMonitor = new Monitor("27inc Beast", "Acer", 27, new Resolution(2540,1440));
        Motherboard mb = new Motherboard("BJ-200", "Asus",4,6,"v3.69");
        PC thePC = new PC(theCase, theMonitor, mb);

        thePC.getMonitor().drawPixelAt(150,1200,"kia");
        thePC.getMotherboard().loadProgram("Babberlicious Boo");
        thePC.getTheCase().pressPower();

        // End Composition

//        Kia kia = new Kia(50 * 12);
//        kia.steer(25);
//        kia.accelerate(30);
//        kia.accelerate(20);

//        BankAccount czaraccount = new BankAccount("Czar",10_000);
//        System.out.println("Current Balance: " + czaraccount.getBalance());
//        czaraccount.deposit(1700);
//        czaraccount.withdraw(4200);

//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
//
//        if (score < 1000) {
//            System.out.println("n00b");
//        } else if (score < 5000) {
//            System.out.println("Getting there. Score: " + score);
//        } else
//            System.out.println("uber");
//
//        if(gameOver) {
//            System.out.println("Your final score: " + (score + (levelCompleted * bonus)));
//        }


    // Operator Challenge
//        double first = 20.00d;
//        double second = 80.00d;
//        double step3 = (first + second) * 100.00d;
//        double step4 = step3 % 40.00d;
//        boolean step5 = step4 == 0 ? true : false;
//        System.out.println(step5);
//
//        if(!step5) {
//            System.out.println("Got some remainder");
//        } else {
//            System.out.println("All good");
//        }


    }

    public static void PositiveNegativeZero (int num) {

    }
}
