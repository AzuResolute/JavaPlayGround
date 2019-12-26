import javax.management.monitor.Monitor;
import java.lang.management.MonitorInfo;
import java.util.Scanner;
import java.util.stream.Stream;

public class TimB {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++) {
//            System.out.printf("Element %d, typed value was %d\r", i, myIntegers[Wi]);
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

        // End Composition

//        Kia kia = new Kia(50 * 12);
//        kia.steer(25);
//        kia.accelerate(30);
//        kia.accelerate(20);

//        BankAccount czaraccount = new BankAccount("Czar",10_000);
//        System.out.println("Current Balance: " + czaraccount.getBalance());
//        czaraccount.deposit(1700);
//        czaraccount.withdraw(4200);
    }

    public static int[] getIntegers(int numbers) {
        System.out.printf("Enter %d integer values.\r", numbers);
        int[] values = new int[numbers];
//        values = Stream.of(values).mapToInt(n -> scanner.nextInt()).toArray();
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
