import java.util.Arrays;
import java.util.stream.Stream;

public class SortAlgo {
    public static void main(String[] args) {
        System.out.println("Hello");
        BubbleSort.result();
    }
}

class BubbleSort extends Sort {

}

abstract class Sort {
    public static int[] sample = new int[]{1, 3, 2, 4, 7, 9, 13, 8};

    public static int sort (int a, int b) {
        return a - b;
    }

    public static void result () {
        int[] temp = sample;
        Arrays.sort(temp);
        Arrays.stream(sample).forEach(System.out::println);
    }
}