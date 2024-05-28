package bites.examples;

public class Discounter {
    Integer discount;

    public Discounter(Integer discount) {
        this.discount = discount;
    }

    public Integer applyTo(Integer amount) {
        amount -= discount;
        return amount;
    }

    public static void main(String[] args) {
        Discounter discounter = new Discounter(20);
        System.out.println(discounter.applyTo(100));
        System.out.println(discounter.applyTo(200));
    }
}
