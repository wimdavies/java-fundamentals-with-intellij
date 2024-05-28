package bites.examples;

public class Bagel {
    public static void main(String[] args) {
        Bagel bagel = new Bagel();
        System.out.println(bagel.seeds());
        System.out.println(bagel.filling());
        System.out.println(bagel.price());
    }

    public String seeds() {
        return "Sesame";
    }

    public String filling() {
        return "Smoked salmon and cream cheese";
    }

    public Integer price() {
        return 150;
    }
}
