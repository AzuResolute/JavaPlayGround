public class Section4 {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));

        printConversion(1.5);

//      checkNumber(5);
//      checkNumber(-5);
//      checkNumber(0);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        return kilometersPerHour >= 0 ? Math.round(kilometersPerHour / 1.609) : -1;
    }
    public static void printConversion (double kilometersPerHour) {
        if(kilometersPerHour >= 0) {
            System.out.printf("%s km/h = %d mi/h", kilometersPerHour, toMilesPerHour(kilometersPerHour));
        } else {
            System.out.println("Invalid Value");
        }
    }

    // Try using printf to learn formatting

    // example
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
