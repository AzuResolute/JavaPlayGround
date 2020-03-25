import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collection;

public class SortAlgo {
    public static void main(String[] args) {
        System.out.println("Hello");
//        BubbleSort.result();
//        MergeSort.result();
        QuickSort.result();
    }
}

class QuickSort extends Sort {

    public static int[] swap (int[] array, Integer pointerA, Integer pointerB) {
        int temp = array[pointerA];
        array[pointerA] = array[pointerB];
        array[pointerB] = temp;
        return array;
    }

    public static int partition (int[] array, Integer start, Integer end) {
        start = start != null ? start : 0;
        end = end != null ? end : array.length + 1;

        int pivot = array[start];
        int swapIndex = start;

        for(int i = start + 1; i < array.length; i++) {
            if(pivot > array[i]) {
                swapIndex++;
                array = swap(array, swapIndex, i);
            }
        }
        array = swap(array, start, swapIndex);
        System.out.println(Arrays.toString(array));
        return swapIndex;
    }

    public static int[] quickSort (int[] array, Integer start, Integer end) {
        start = start != null ? start : 0;
        end = end != null ? end : array.length - 1;
        // base case
        if(start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
        return array;
    }

    public static void result() {
        System.out.println(quickSort(sample, null, null));
        Arrays.stream(sample).forEach(System.out::println);
    }
}

class MergeSort extends Sort {

    public static int[] merge (int[] a, int[] b) {
        int pointerA = 0;
        int pointerB = 0;
        List<Integer> result = new ArrayList<Integer>();
        while(pointerA < a.length && pointerB < b.length) {
            if(a[pointerA] > b[pointerB]) {
                result.add(b[pointerB]);
                pointerB++;
            } else {
                result.add(a[pointerA]);
                pointerA++;
            }
            System.out.println(result.toString());
        }

        while(pointerA < a.length) {
            result.add(a[pointerA]);
            pointerA++;
        }

        while(pointerB < b.length) {
            result.add(b[pointerB]);
            pointerB++;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] mergeSort (int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int midpoint = (int)Math.floor(array.length / 2);
        int[] left =  mergeSort(Arrays.stream(array).boxed().collect(Collectors.toList()).subList(0,midpoint).stream().mapToInt(Integer::intValue).toArray());
        int[] right =  mergeSort(Arrays.stream(array).boxed().collect(Collectors.toList()).subList(midpoint, array.length).stream().mapToInt(Integer::intValue).toArray());
        return merge(left, right);
    }

    public static void result () {
        int[] result = mergeSort(sample);
        Arrays.stream(result).forEach(System.out::println);
    }
}

class BubbleSort extends Sort {

    public static void algorithm () {
        System.out.println("invoked");
        for(int i = sample.length; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                System.out.println(Arrays.toString(sample));
                if(sample[j] > sample[j+1]) {
                    int temp = sample[j];
                    sample[j] = sample[j + 1];
                    sample[j + 1] = temp;
                }
            }
        }
    }

    public static void result () {
        algorithm();
        Arrays.stream(sample).forEach(System.out::println);
    }
}

abstract class Sort {
    public static int[] sample = new int[]{78, 364, 55, 46, 74, 954, 613, 85, 0, 132, 543, 64, 54, 123};

    public static int sort (int a, int b) {
        return a - b;
    }

    public static void algorithm () {
        Arrays.sort(sample);
    }

    public static void result () {
        Arrays.stream(sample).forEach(System.out::println);
    }
}