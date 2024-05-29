package bites.examples;

import java.util.ArrayList;

public class Queue {
    ArrayList<String> people = new ArrayList<>();

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Clara");
        queue.add("Dinesh");
        queue.state();
        queue.next();
        queue.state();
        queue.next();
        queue.state();
    }

    private void add(String person) {
        people.add(person);
    }

    private void next() {
        people.remove(0);
    }

    private void state() {
        System.out.println("\nHere is the current queue:");
        for (String person : people) {
            System.out.println(person);
        }
    }
}
