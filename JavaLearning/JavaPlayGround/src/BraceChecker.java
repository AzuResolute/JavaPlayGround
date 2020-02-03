import java.util.*;

public class BraceChecker {

    public static void main(String[] args) {
        String[] stuff = {"" ,"(){}[]", "[(])", "([{}])", "(}", "[(])"};
        System.out.printf("%s should be %s%n", stuff[0], isValid(stuff[0]));
        System.out.printf("%s should be %s%n", stuff[1], isValid(stuff[1]));
        System.out.printf("%s should be %s%n", stuff[2], isValid(stuff[2]));
        System.out.printf("%s should be %s%n", stuff[3], isValid(stuff[3]));
        System.out.printf("%s should be %s%n", stuff[4], isValid(stuff[4]));
        System.out.printf("%s should be %s%n", stuff[5], isValid(stuff[5]));
    }

    public static boolean isValid(String braces) {
        if(braces.length() == 0) {
            return false;
        } else {
            String begin = "{[(";
            String pairings = "{}[]()";
            StringBuilder pending = new StringBuilder();

            for (int i = 0; i < braces.length(); i++) {
                char letter = braces.charAt(i);
                if(begin.contains(String.valueOf(letter))) {
                    pending.append(letter);
                }
                else {
                    int indexAtPairings = pairings.indexOf(letter);
                    if (pending.charAt(pending.length() - 1) == pairings.charAt(indexAtPairings - 1)) {
                        pending.deleteCharAt(pending.length() - 1);
                    }
                    else {
                        return false;
                    }
                }
            }
            return pending.length() == 0;
        }
    }
}