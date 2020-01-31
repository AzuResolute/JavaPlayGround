/*
The error message is

Exception in thread "main" java.lang.ArithmeticException: / by zero
 	at Throw1.main(Throw1.java:23)

Exit status is 1.

Also try the following pairs:

double dividend = 1.0;  //no exception, prints Infinity
double divisor = 0.0;

double dividend = Double.MAX_VALUE; //no exception, prints Infinity
double divisor = 0.5;

double dividend = Double.MIN_VALUE; //no exception, prints 0.0
double divisor = 2.0;

and also try int i = Math.addExact(Int.MAX_VALUE, 1);
*/

public class Throw1 {
    public static void main(String[] args) {
        try {
            otherMethod();
        }

        catch (DivideByZero d) {
            System.err.println(d.getMessage());
        }

        catch (OverFlow ov) {
            System.err.println(ov.getMessage());
        }

        finally {
            System.out.println("All done.");
        }
    }

    private static void otherMethod() throws DivideByZero, OverFlow {
        final double dividend = Double.MAX_VALUE;
        final double divisor = 2 * Math.random();

        if (divisor == 0.0) {
            throw new DivideByZero();
        }

        if (divisor < 1.0) {
            throw new OverFlow();
        }

        System.out.println(dividend/divisor);
    }
}

class DivideByZero extends Exception {
    public DivideByZero() {		//constructor
        super("can't divide by zero");
    }
}

class OverFlow extends Exception {
    public OverFlow() {
        super("quotient would overflow");
    }
}

class UnderFlow extends Exception {

}