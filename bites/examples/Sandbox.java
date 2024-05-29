package bites.examples;

import java.util.ArrayList;

public class Sandbox {
    public static void main(String[] args) {
        // first, create the ArrayList and add some Integers
        ArrayList<Integer> reallyGreatNumbers = new ArrayList<Integer>();
        reallyGreatNumbers.add(3);
        reallyGreatNumbers.add(5);
        reallyGreatNumbers.add(7);
        reallyGreatNumbers.add(11);
        // you can read / get an item using its index
        reallyGreatNumbers.get(0);
        // => 3
        reallyGreatNumbers.get(1);
        // => 5

        // you can change an item using its index and the new value
        reallyGreatNumbers.set(0, 11);
        // would change the first item to 11

        // you can remove an item using its index
        reallyGreatNumbers.remove(0);
        // would remove the first item

        for (Integer number : reallyGreatNumbers) {
            System.out.println(number);
        }

        // creating an empty Array of length 100, holding Strings
        String[] plantsIHaveKilled = new String[100];

        // create an array of four Strings
        String[] famousCats = {"Larry", "Palmerston", "Geronimo", "Cat Stevens"};

        // get the first item
        // famousCats[0]
        // => "Larry"

        // change the first item
        famousCats[0] = "Grumpy Cat";

        // remove the first item by replacing it will `null`
        famousCats[0] = null;
    }
}
