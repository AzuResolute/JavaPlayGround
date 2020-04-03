import javax.management.monitor.Monitor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.MonitorInfo;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;
import java.math.BigInteger;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;



public class TimB {


    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit,"Muramatsu");
        addInOrder(placesToVisit,"Angela");
        addInOrder(placesToVisit,"Alexa");
        addInOrder(placesToVisit,"Crysta");
        addInOrder(placesToVisit,"Sameena");
        addInOrder(placesToVisit,"Trang");
        addInOrder(placesToVisit,"Ling");
        addInOrder(placesToVisit,"Elaine");
        addInOrder(placesToVisit,"Jan");

        printList(placesToVisit);

        placesToVisit.add(5, "Peace");

        printList(placesToVisit);

        placesToVisit.remove(6);
        addInOrder(placesToVisit, "Sameena");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedInPark) {
        Iterator<String> i = linkedInPark.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedInPark, String girl) {
        // ListIterator is a special type of iterator that allows us to go previous as well
        ListIterator<String> stringListIterator = linkedInPark.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(girl);
            if(comparison == 0) {
                System.out.println(girl + " has already been loved.");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(girl);
                return true;
            } else if(comparison < 0) {
                // move on next city

            }
        }

        stringListIterator.add(girl);
        return true;
    }

    private static void visit(LinkedList linkedInPark) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = linkedInPark.listIterator();

        if(linkedInPark.isEmpty()) {
            System.out.println("No girls to visit");
        } else {
            System.out.println("Now dating " + listIterator.next());
            // printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Journey over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Visited all girls");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We just started back at one");
                    }
                    break;
            }


        }
    }

}
