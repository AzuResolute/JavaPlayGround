package collectionsReview;

import java.util.HashMap;

public class MapProgram {
    public static void main(String[] args) {

        // HashMap methods

        // put(key, value) - adds a key / value pair. returns null if brand new k/v pair. otherwise, return the old value
        // get(key) - returns the value of the given key
        // remove(key) - removes a key value pair given key
        // remove(key, value) - removes key value pair given key and value
        // replace(key, value) - replace value if key already exists

        // - Map does not allow itself to be used as a key

        // loop through key value pairs
//        for(String key : languages.keySet()) {
//            System.out.println(key + " : " + languages.get(key));
//        }



        java.util.Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("JavaScript")) {
            System.out.println("JavaScript is already in the map");
        }

        languages.put("Java", "a compiled high level, pbject-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("JavaScript", "the programming language of the web");

        System.out.println(languages.get("JavaScript"));

        if(languages.containsKey("JavaScript")) {
            System.out.println("JavaScript is already in the map");
        } else {
            languages.put("JavaScript", "the programming language of the web AND the future");
        }


        System.out.println("===========================================================================================");

        languages.remove("Algol", "an algorithmic language");
        System.out.println(languages.replace("Java", "Ye Olde Goon Squad"));
        System.out.println(languages.replace("C#", "Another Olde Good Squad"));

        languages.keySet().forEach(k -> System.out.println(k));
        languages.keySet().forEach(k -> System.out.println(k + " : " + languages.get(k)));

    }


}
