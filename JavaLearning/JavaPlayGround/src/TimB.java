public class TimB {

    public static void main(String[] args) {

        BankAccount czaraccount = new BankAccount("Czar",10_000);
        System.out.println("Current Balance: " + czaraccount.getBalance());
        czaraccount.deposit(1700);
        czaraccount.withdraw(4200);

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
