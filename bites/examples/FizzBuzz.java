package bites.examples;

public class FizzBuzz {
    public static String play(Integer number) {
        if (number % 3 == 0 & number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }

    public static void main(String[] args) {
        // for (int i = 1; i <= 100; i++) {
        //     System.out.println(FizzBuzz.play(i));
        // }

        int counter = 1;
        while (counter < 101) {
            System.out.println(FizzBuzz.play(counter));
            counter++;
        }
    }
}
