package bites.examples;

import java.util.HashMap;

public class HashMapScratchPad {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("The Blues", 0);
        System.out.println(scores.get("The Blues"));
        scores.put("The Reds", 0);
        System.out.println(scores.get("The Reds"));
        scores.put("The Blues", 5);
        System.out.println(scores.get("The Blues"));
        scores.put("The Reds", 3);
        System.out.println(scores.get("The Reds"));
    }
}
