public class Point2Demo {
    public static void main(String[] args) {
        //3-4-5 right triangle:

        Point A = new Point(3, 0);
        System.out.println("A == " + A);

        Point B = new Point(0, 4);
        System.out.println("B == " + B);

        // Point fly = new Point(4000, 2000);
        // The fly is not on the screen.

        System.out.println("Distance from A to B == " + A.distance(B));
        System.out.println("Distance from A to B == " + Point.distance(A, B));

        System.out.println("Midpoint of A and B == " + A.midpoint(B));

        Point origin = new Point(0, 0);
        System.out.println("Area == " + origin.area(A, B));
        System.out.println("Area == " + Point.area(origin, A, B));

        Point C = new Point(1, 1);
        System.out.println("C == " + C);
        System.out.println("theta(C) == " + C.theta());
        System.out.println(Point.contains(A, B, C, origin));
        System.out.println(origin.contains(A, B, C));

        // C.move(2000, 1);
        // The point will be moving outside of the screen

        C.move(2,1);
        System.out.println("C == " + C);

        C.move(-3, -2);
        System.out.println("C == " + C);
        System.out.println(origin.contains(A, B, C));

        System.exit(0);
    }
}

class Point {
    // The static fields width and height represents the dimensions of a screen. These should not be changed.

    private static final int width = 1960;
    private static final int height = 1080;

    // The non-static fields x and y represents the coordinates of pixels on a screen.

    private int x;
    private int y;

    public Point(int x, int y) {
        // The constructor for class Point use these static fields to make sure the numbers are within the legal ranges.

        if (!isValid(x, y)) {
            System.err.println("The point is not on the screen.");
            System.exit(1);
        }

        this.x = x;
        this.y = y;
    }

    // We will need to confirm if the x and y coordinates are valid in the constructor and multiples methods

    public static boolean isValid(int x, int y) {
        return x < width && y < height && x >= 0 && y >= 0;
    }

    //Distance between this point and another one.

    public double distance(Point another) {
        final double dx = x - another.x;	//horizontal distance
        final double dy = y - another.y;	//vertical distance
        return Math.hypot(dx, dy);
    }

    public static double distance(Point p1, Point p2) {
        final double dx = p1.x - p2.x;	//horizontal distance
        final double dy = p1.y - p2.y;	//vertical distance
        return Math.hypot(dx, dy);
    }

    public Point midpoint(Point another) {	//method returns an object
        final int mx = (x + another.x) / 2;
        final int my = (y + another.y) / 2;
        return new Point(mx, my);
    }

    public void move(int right, int up) {
        int newX = x + right;
        int newY = y + up;

        if (!isValid(newX, newY)) {
            System.err.println("The point is moving outside of the screen.");
            System.exit(1);
        }

        x = newX;
        y = newY;
    }

    public double theta() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    //Area of triangle whose vertices are this point, B, and C.
    //Instead of x and y, could say this.x and this.y.

    public double area(Point B, Point C) {
        return Math.abs(x * B.y + B.x * C.y + C.x * y
                - y * B.x - B.y * C.x - C.y * x) / 2;
    }

    //Area of triangle whose vertices are points A, B, and C.

    public static double area(Point A, Point B, Point C) {
        return Math.abs(A.x * B.y + B.x * C.y + C.x * A.y
                - A.y * B.x - B.y * C.x - C.y * A.x) / 2;
    }

    //Return true if triangle ABC contains point D.

    public static boolean contains(Point A, Point B, Point C, Point D) {
        return area(A, B, C)
                == area(D, A, B) + area(D, B, C) + area(D, C, A);
    }

    // The above can be confusing. This is an example of when a method should belong to an object

    public boolean contains(Point A, Point B, Point C) {
        return area(A, B, C)
                == this.area(A, B) + this.area(B, C) + this.area(C, A);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}