package bites.examples;

public class Year {
    public static boolean isLeap(Integer year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static void main(String[] args) {
        System.out.println(Year.isLeap(2000));
        System.out.println(Year.isLeap(1970));
        System.out.println(Year.isLeap(1900));
        System.out.println(Year.isLeap(1988));
        System.out.println(Year.isLeap(1500));
    }
}
