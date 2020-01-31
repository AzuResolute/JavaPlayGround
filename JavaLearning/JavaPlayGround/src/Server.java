import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.util.IllegalFormatException;

public class Server {
    public static void main(String[] args) {
        try {
            int bond = 7;
            int percent = 100;
            String name = "Bond";

            //Could say printf instead of format.
            //%n is the line separator.

            System.out.format("%d%n", bond);
            System.out.format("%3d%n", bond);
            System.out.format("%03d%n", bond);

            System.out.format("%-3d", bond);
            System.out.println("Previous bond was left-justified.");

            System.out.format("%d %d %s%n", bond, percent, name);

            System.out.format("I agree %d%%, Mister %s.%n",
                    percent, name);

            System.out.println("I agree " + percent + "%, Mister "
                    + name + ".");
            System.out.println();

            double pi = Math.PI;
            System.out.format("%f%n", pi);
            System.out.format("%10f%n%n", pi);

            //6 decimal places by default.  Can get more or less.
            System.out.format("%10.8f%n", pi);
            System.out.format("%.8f%n", pi);
            System.out.format("%.4f%n%n", pi);

            //Break ties by rounding up.
            System.out.format("%.4f%n", 3.14154);
            System.out.format("%.4f%n", 3.14155);
        }

        catch (IllegalFormatException e) {
            System.err.println(e.getMessage());
        }

        catch (NullPointerException e) { //if 1st arg of format is null
            System.err.println(e.getMessage());
        }
    }
}