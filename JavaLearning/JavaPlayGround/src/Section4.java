public class Section4 {
    public static void main(String[] args) {
        System.out.printf("%B", isLeapYear(-1600));
        System.out.printf("%B", isLeapYear(1600));
        System.out.printf("%B", isLeapYear(2017));
        System.out.printf("%B", isLeapYear(2000));
    }

    // Leap Year Calculator

    public static boolean isLeapYear (int year) {
        if((0 < year) && (year <= 9999)) {
            if((year % 4 == 0) && (!(year % 100 == 0) || (year % 400 == 0))){
                return true;
            }
        }
        return false;
    }


    // Barking Dog
    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay) {
        return isBarking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23);
    }

    // MegaBytes Converter
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int kb2mb = 1024;
        if(kiloBytes >= 0)
            System.out.printf("%d KB = %d MB and %d KB",
                    kiloBytes,
                    Math.floorDiv(kiloBytes, kb2mb),
                    kiloBytes % kb2mb);
        else
            System.out.println("Invalid Value");
    }

    //SpeedConverter
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
