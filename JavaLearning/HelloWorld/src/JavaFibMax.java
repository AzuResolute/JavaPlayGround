import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class JavaFibMax {
    public static void main(String[] args) {

        /** 5 Test are made to check the power and speed of the PrimeFibMax function
         * Tests are located at line 110*/

        for(int i = 1; i <= 5; i++) {
            System.out.println("Test "+i+" ------- > "+PrimeFibMax(Tests(i)));
        }
    }

    public static int PrimeFibMax (int[][] given) {
        ArrayList<Integer> fibList = ListFibonacci(1);
        int currentPrimeFibMax = 0;

        /** Condition states a given of a 5* 6 2D array, so I do not have to worry about null
         * This is what I would've done otherwise to account for a null */
        //  if(given == null) {
        //      return 0;
        //  }

        for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < given[i].length; j++) {

                int currentNumber = given[i][j];
                int currentFibListSize = fibList.size();
                while(currentNumber > fibList.get(currentFibListSize - 1)) {
                    fibList.add(Fibonacci(currentFibListSize + 1));
                    currentFibListSize++;
                }
                if (currentNumber <= currentPrimeFibMax || currentNumber < 0) {
                    continue;
                } else if (isPrimeFib(currentNumber, fibList)) {
                    currentPrimeFibMax = currentNumber;
                }
            }
        }
        return currentPrimeFibMax;
    }

    public static boolean isPrimeFib (int number, ArrayList<Integer> fibList) {
        if (!IsPrime(number) || fibList.indexOf(number) < 0) {
            return false;
        }
        return true;
    }

    public static int Fibonacci (int position) {
        if(position == 1) {
            return 0;
        }
        else if(position == 2) {
            return 1;
        }

        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 0);
        memo.put(2, 1);
        return Fibonacci(position - 1, memo) + Fibonacci(position - 2, memo);
    }

    public static int Fibonacci (int position, Map<Integer, Integer> memo) {
        /** The memo is used to reduce time complexity of the Fibonacci
         *  from an Exponential O(2^N) to Linear O(2N) */

        if (memo.containsKey(position)) {
            return memo.get(position);
        }
        else if(position == 1) {
            return 0;
        }
        else if(position == 2) {
            return 1;
        }
        else {
            memo.put(position, (Fibonacci(position - 1, memo) + Fibonacci(position - 2, memo)));
            return memo.get(position);
        }
    }

    public static boolean IsPrime (int number) {
        if(number == 1) {
            return false;
        }
        else if (number == 2) {
            return true;
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static ArrayList<Integer> ListFibonacci (int size) {
        ArrayList<Integer> fibList = new ArrayList<Integer>(size);
        for (int i = 1; i <= size; i++) {
            fibList.add(Fibonacci(i));
        }
        return fibList;
    }

    public static int[][] Tests (int testNum) {
        int[][][] TestBank = {
                {
                        {987,28659,104911,-1,1000},
                        {121394,555,233,1,45678},
                        {17,13,514229,-123,-456},
                        {1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5}
                },{
                {987,654,321, 874, 512 ,325},
                {1,2,3, 4, 5 ,6},
                {0,27,23, 345, 345 ,2452},
                {0,0,89 , 433494437 /* valid prime/fib */, 34567,9876},
                {1,0,83, 71, 512 ,0},
                {1,23,2, 1, 512 ,978},
        },{
                {1234567,876543,32121, 765353, 14314 ,43124},
                {98576,123414,98345, 32456, 544354 ,3214},
                {243526,34563563,543563, 12341, 123452345 ,65433456},
                {341324,12341,34561, 3564536, 654364 ,42314132},
                {1234,234321,1324123, 1234, 123414 , 2 /* Only valid prime/fib*/},
                {155413,12343241,6365365, 35464356, 54365 ,34562},
        },{
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,-7896451}
        },{
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,2,0,0},
                {0,0,0,0,0,0}
        },
                null
        };
        return TestBank[testNum-1];
    }
}