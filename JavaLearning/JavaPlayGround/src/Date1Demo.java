public class Date1Demo {
    public static void main(String[] args) {
        FastDate fd = new FastDate(4, 30, 2007);
        System.out.println(fd);
        fd.next(7);
        System.out.println(fd);
        System.out.println();

        SmallDate sd = new SmallDate(4, 30, 2007);
        System.out.println(sd);
        sd.next(7);
        System.out.println(sd);
    }
}

class FastDate {
    private int year;
    private int month;
    private int day;
    static final int length[] = {
            0,
            31,	//January
            28,	//February
            31,	//March
            30,	//April
            31,	//May
            30,	//June
            31,	//July
            31,	//August
            30,	//September
            31,	//October
            30,	//November
            31	//December
    };

    public FastDate(int m, int d, int y) {
        if (y == 0) {
            System.err.println("No year 0.");
            System.exit(1);
        }

        if (m < 1 || m > 12) {
            System.err.println("Bad month " + m + ".");
            System.exit(1);
        }

        if (d < 1 || d > length[m]) {
            System.err.println("Bad day " + d
                    + " in month " + m + ".");
            System.exit(1);
        }

        year = y;
        month = m;
        day = d;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public void next() {
        if (++day > length[month]) {
            day = 1;
            if (++month > 12) {
                month = 1;
                if (year == Integer.MAX_VALUE) {
                    System.err.println("already at maximum FastDate "
                            + this);
                    System.exit(1);
                }
                ++year;
            }
        }
    }

    public void next(int i) {
        //Call the no-argument next method i times.
        for (; i > 0; --i) {
            next();
        }
    }
}

class SmallDate {
    private int day;	//# days before or after January 1, 1 A.D.
    static final int length[] = {
            0,
            31,	//January
            28,	//February
            31,	//March
            30,	//April
            31,	//May
            30,	//June
            31,	//July
            31,	//August
            30,	//September
            31,	//October
            30,	//November
            31	//December
    };

    public SmallDate(int m, int d, int y) {
        if (y == 0) {
            System.err.println("No year 0.");
            System.exit(1);
        }

        if (m < 1 || m > 12) {
            System.err.println("Bad month " + m + ".");
            System.exit(1);
        }

        if (d < 1 || d > length[m]) {
            System.err.println("Bad day " + d
                    + " in month " + m + ".");
            System.exit(1);
        }

        day = 365 * (y - 1) + d - 1;

        for (int i = m - 1; i < m; ++i) {
            day += length[i];
        }

		/*
		Could write the above loop as
		for (--m; m > 0; --m) {
			day += length[m];
		}
		*/
    }

    public void next() {
        if (day == Integer.MAX_VALUE) {
            System.err.println("already at maximum SmallDate "
                    + this);
            System.exit(1);
        }
        ++day;
    }

    public void next(int i) {
        //Call the no-argument next method i times.
        for (; i > 0; --i) {
            next();
        }
    }

    public String toString() {
        final int year = 1 + day / 365;
        int d          = 1 + day % 365;

        int m = 1;
        for (; d > length[m]; ++m) {
            d -= length[m];
        }
        return m + "/" + d + "/" + year;
    }
}