package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        System.out.println(Announcement.celebration());
        System.out.println(Announcement.changeOfPlan());
        System.out.println(Announcement.apology());
        System.out.println(Announcement.politeNotice());
        System.out.println(Announcement.helpNeeded());
    }

    public static String celebration() {
        return "I'm learning this bloody language!";
    }

    public static String changeOfPlan() {
        return "On second thoughts, maybe I'll give up.";
    }

    public static String apology() {
        return "Sorry, I hate this new IDE.";
    }

    public static String politeNotice() {
        return "Nonetheless, I will still try.";
    }

    public static String helpNeeded() {
        return "But I need help!";
    }
}
