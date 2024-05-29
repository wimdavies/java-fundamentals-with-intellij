package bites.examples;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapScratchPad {
    public static void main(String[] args) {
        HashMap<String, Integer[]> scores = new HashMap<>();
        scores.put("The Blues", new Integer[] {1, 2, 3});
        scores.put("The Reds", new Integer[] {2, 3, 4});
        System.out.println(scores.get("The Blues")[0]);
        System.out.println(Arrays.toString(scores.get("The Blues")));
        System.out.println(Arrays.toString(scores.get("The Reds")));
    }
}
