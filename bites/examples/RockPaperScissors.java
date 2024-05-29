package bites.examples;

import java.util.HashMap;

public class RockPaperScissors {
    static HashMap<String, HashMap<String, String>> rules = new HashMap<>();

    public static String play (String player1, String player2) {
        return rules.get(player1).get(player2);
    }

    public static void main(String[] args) {
        HashMap<String, String> rockOutcomes = new HashMap<>();
        HashMap<String, String> paperOutcomes = new HashMap<>();
        HashMap<String, String> scissorsOutcomes = new HashMap<>();

        rockOutcomes.put("rock", "draw");
        rockOutcomes.put("paper", "Player 2 wins");
        rockOutcomes.put("scissors", "Player 1 wins");

        paperOutcomes.put("rock", "Player 1 wins");
        paperOutcomes.put("paper", "draw");
        paperOutcomes.put("scissors", "Player 2 wins");

        scissorsOutcomes.put("rock", "Player 2 wins");
        scissorsOutcomes.put("paper", "Player 1 wins");
        scissorsOutcomes.put("scissors", "draw");

        rules.put("rock", rockOutcomes);
        rules.put("paper", paperOutcomes);
        rules.put("scissors", scissorsOutcomes);

        System.out.println(RockPaperScissors.play("rock", "paper"));
        System.out.println(RockPaperScissors.play("paper", "paper"));
        System.out.println(RockPaperScissors.play("scissors", "paper"));
    }
}
