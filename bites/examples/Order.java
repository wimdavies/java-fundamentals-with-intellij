package bites.examples;

public class Order {
    Integer total = 0;

    public Integer getTotal() {
        return this.total;
    }

    public void addAmount(Integer amount) {
        this.total += amount;
    }

    public void addDiscount(Integer amount) {
        this.total -= amount;
    }

    public String friendlyTotal() {
        return String.format("Thanks! The total value of your order is £%d.", getTotal());
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addAmount(10);
        order.addDiscount(5);
        System.out.println(order.friendlyTotal());
    }
}
