package bites.examples;

import java.util.HashMap;

public class ScrabbleScore {
    static HashMap<Character, Integer> letterValues = new HashMap<>();

    static {
        letterValues.put('A', 1);
        letterValues.put('B', 3);
        letterValues.put('C', 3);
        letterValues.put('D', 2);
        letterValues.put('E', 1);
        letterValues.put('F', 4);
        letterValues.put('G', 2);
        letterValues.put('H', 4);
        letterValues.put('I', 1);
        letterValues.put('J', 8);
        letterValues.put('K', 5);
        letterValues.put('L', 1);
        letterValues.put('M', 3);
        letterValues.put('N', 1);
        letterValues.put('O', 1);
        letterValues.put('P', 3);
        letterValues.put('Q', 10);
        letterValues.put('R', 1);
        letterValues.put('S', 1);
        letterValues.put('T', 1);
        letterValues.put('U', 1);
        letterValues.put('V', 4);
        letterValues.put('W', 4);
        letterValues.put('X', 8);
        letterValues.put('Y', 4);
        letterValues.put('Z', 10);
    }

    public static void main(String[] args) {
        System.out.println(ScrabbleScore.calculate("a"));
        System.out.println(ScrabbleScore.calculate("queue"));
    }

    public static int calculate(String word) {
        int totalScore = 0;
        for (char letter : word.toUpperCase().toCharArray()) {
            int letterScore = letterValues.get(letter);
            totalScore += letterScore;
        }
        return totalScore;
    }
}
