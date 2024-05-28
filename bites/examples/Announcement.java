package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        Announcement announcement = new Announcement();

        System.out.println(announcement.celebration());
        System.out.println(announcement.changeOfPlan());
        System.out.println(announcement.apology());
        System.out.println(announcement.politeNotice());
        System.out.println(announcement.helpNeeded());
    }

    public String celebration() {
        return "I'm learning this bloody language!";
    }

    public String changeOfPlan() {
        return "On second thoughts, maybe I'll give up.";
    }

    public String apology() {
        return "Sorry, I hate this new IDE.";
    }

    public String politeNotice() {
        return "Nonetheless, I will still try.";
    }

    public String helpNeeded() {
        return "But I need help!";
    }
}
