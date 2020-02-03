public class M3Algo {
    public static void main(String[] args) {
        System.out.println(numberOfPaths(10,3));
    }

    public static int numberOfPaths (int nrows, int ncols) {
        if (nrows == 1 || ncols == 1) {
            return nrows != ncols ? 1 : 0;
        }
        return numberOfPaths(Math.max(nrows - 1, 1), ncols) + numberOfPaths(nrows, Math.max(ncols - 1, 1));
    }
}
