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

    }
}
