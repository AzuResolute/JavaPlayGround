public class TimB {

    public static void main(String[] args) {
        // Operator Challenge
        double first = 20.00d;
        double second = 80.00d;
        double step3 = (first + second) * 100.00d;
        double step4 = step3 % 40.00d;
        boolean step5 = step4 == 0 ? true : false;
        System.out.println(step5);

        if(!step5) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("All good");
        }
    }

}
