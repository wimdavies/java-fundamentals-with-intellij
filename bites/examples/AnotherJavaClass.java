package bites.examples;

public class AnotherJavaClass {
    public static void main(String[] args) {
//        when run from the cmd line, this prints each argument passed to it
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println("I am printing each string arg:");
            System.out.println(arg);
        }
    }
}
