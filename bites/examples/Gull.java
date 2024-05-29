package bites.examples;

public class Gull implements BirdBehaviours {
    @Override
    public String fly() {
        return "I love to soar above the waves.";
    }

    @Override
    public String sing() {
        return "Screeeah-ah-ah-ah!";
    }

    @Override
    public String eat(String food) {
        if (food.equalsIgnoreCase("chips")) {
            return "I love to eat your chips!";
        } else if (food.equalsIgnoreCase("fish")) {
            return "I should eat more fish, it's good for me.";
        } else {
            return "Yeah, I'll probably eat that. Cheers.";
        }
    }

    public static void main(String[] args) {
        Gull gull = new Gull();
        System.out.println(gull.fly());
        System.out.println(gull.sing());
        System.out.println(gull.eat("chips"));
        System.out.println(gull.eat("fish"));
        System.out.println(gull.eat("ice cream"));
    }
}
