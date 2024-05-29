package bites.examples;

public class Penguin implements BirdBehaviours {

    @Override
    public String fly() {
        return "I definitely can't fly!";
    }

    @Override
    public String sing() {
        return "I don't really sing, sorry!";
    }

    @Override
    public String eat(String food) {
        if (food.equalsIgnoreCase("fish")) {
            return "Yum, I love fish!";
        } else {
            return "I don't want to eat that!";
        }
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        System.out.println(penguin.fly());
        System.out.println(penguin.sing());
        System.out.println(penguin.eat("chips"));
        System.out.println(penguin.eat("fish"));
    }
}
