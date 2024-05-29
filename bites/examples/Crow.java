package bites.examples;

public class Crow implements BirdBehaviours {
    @Override
    public String fly() {
        return "I prefer to hop.";
    }

    @Override
    public String sing() {
        return "Cark, cark!";
    }

    @Override
    public String eat(String food) {
        return "I'll eat anything!";
    }

    public static void main(String[] args) {
        Crow crow = new Crow();
        System.out.println(crow.fly());
        System.out.println(crow.sing());
        System.out.println(crow.eat("chips"));
        System.out.println(crow.eat("fish"));
        System.out.println(crow.eat("ice cream"));
    }
}
