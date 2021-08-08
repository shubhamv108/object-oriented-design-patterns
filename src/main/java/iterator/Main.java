package iterator;

import iterator.implementations.collections.ArrayList;

/**
 * Provide a way to access the elements of an aggregate object sequentially
 * without exposing its underlying representation.
 *
 * The iterator pattern allow us to:
 * 1) access contents of a collection without exposing its internal structure.
 * 2) support multiple simultaneous traversals of a collection.
 * 3) provide a uniform interface for traversing different collection.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("0");
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");
        strings.add("7");
        strings.add("8");
        strings.add("9");

        IIterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if ("5".equals(string)) {
                iterator.remove();
            } else {
                System.out.println(string);
            }
        }
    }

}
