import javax.management.monitor.Monitor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.MonitorInfo;
import java.util.Scanner;
import java.util.stream.Stream;

public class TimB {

    private static Scanner scanner = new Scanner(System.in);

    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    private static int getInt() {
        try {
            return Integer.parseInt(reader.readLine());
        }
        catch (IOException e) {
            System.err.println("Couldn't receive input: "
                    + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.err.println(e.getMessage()
                    + ", the characters were not a number.");
        }
        return 0;
    }

    static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i / 3);
        //System.out.println(i / 0);	//Don't do this!

        System.out.println("Smallest: == " + Integer.MIN_VALUE); //uppercase I
        System.out.println("Biggest: ==  " + Integer.MAX_VALUE);

        int power = (int)Math.pow(2, 31);   //The (int) is a cast.
        System.out.println("power == " + power);

        i = Integer.MAX_VALUE;
        ++i;	//means i = i + 1;
        System.out.println(i);
        System.exit(0);

//        oogabooga: for (int n = 2; n <= 100; n = n + 1) {
//            for (int i = 2; i < n; i = i + 1) {
//                if (n % i == 0) {
//                    continue oogabooga;
//                }
//            }
//            System.out.println(n);
//        }


//        System.out.print("How many copies? ");
//        int n = getInt();
//        String sum = "";
//
//        for (int i = 1; i <= n; i = i + 1) {
//            sum = sum + "ha";	//sum += "ha";
//        }
//
//        System.out.println(sum + "!");

//        int n = 100;
//        int sum = 0;
//
//        for (int i = 1; i <= n; i = i + 1) {
//            sum += i;
//        }
//
//        System.out.println("The sum of the numbers from 1 to " + n
//                + " is " + sum + ".");

//        int sum = 0;
//
//        for (int i = 1; i <= 1000; i = i + 1) {
//            sum += i;
//        }
//
//        System.out.println("The sum of the numbers from 1 to 10 is "
//                + sum + ".");

        //System.out.println("After the loop is over, i is " + i + ".");

//        int i = 100;
//
//        //Deviate form a stright line.
//
//        while (i == 10) {	//No semicolon after the )
//            System.out.println(i);
//            i--;
//        }

//        System.out.println("After the loop is over, i is " + i + ".");

//        int i = 10;
//        int moe = 20, larry = 30;
//        final int stubborn = 40;
//
//        System.out.println("The initial value of i is " + i);
//
//        i = 50;
//        System.out.println("The new value of i is " + i);
//
//        i = moe + 1;
//        System.out.println("The new value of i is " + i);
//
////        stubborn = 60;	//won't compile
//
//        i = i + 1;
//        System.out.println("The new value of i is " + i);
//
//        i = i + 1;
//        System.out.println("The new value of i is " + i);

//        int i = 10;
//        int j = 20;
//        int sum1 = i + j;	//arithmetic with + - * /
//        int sum2 = 30 - 40;	//can also do arithmetic with literals
//        int sum3 = 50 + i + Math.abs(sum2);	//absolute value
//
//        System.out.println(i + 10 + "i + 10 is ");	//Prints 1010.
//        System.out.println("i + 10 is " + (i + 10));	//Prints 20.

//        int i = 10;	//create a variable named i of data type int
//        int moe = 20, larry = 30;
//        int badboy;
//
//        int biggest =   2147483647;
//        int smallest = -2147483648;

//        System.out.println(i);		//Print contents of variable.
//        System.out.println("i");	//Print the letter "i".
        //System.out.println(badboy);	//won't compile: uninitialized

//        System.out.print("The values of moe and larry are ");
//        System.out.print(moe);
//        System.out.print(" and ");
//        System.out.print(larry);
//        System.out.println(".");
//        System.out.println("smallest: " + smallest);
//        System.out.println("smallest - 1: " + (smallest - 1));

//        int[] myIntegers = getIntegers(5);
//        for(int i = 0; i < myIntegers.length; i++) {
////            System.out.printf("Element %d, typed value was %d\r", i, myIntegers[Wi]);
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }
//        System.out.println("The average is " + getAverage(myIntegers));

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
