import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class PlayGround {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    // Learn Java Streams

    public static int DuplicateCount(String text){
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
        Arrays.stream(text.toLowerCase().split("")).forEach(l -> {
            if(dictionary.containsKey(l)){
                dictionary.put(l, dictionary.get(l) + 1);
            } else {
                dictionary.put(l, 1);
            }
        });
        return (int)Arrays.stream(dictionary.keySet().toArray()).filter(k -> dictionary.get(k) > 1).count();
    }
}

// shortcut

// sout: System.out.println