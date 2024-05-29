package bites.examples;

public class ReadingList {
    String[] unread = new String[4];

    public void add(String book) {
        int index = 0;
        while (true) {
            if (unread[index] == null) {
                unread[index] = book;
                break;
            }
            index++;
        }
    }

    public static void main(String[] args) {
        ReadingList readingList = new ReadingList();
        readingList.add("Thomas the Tank Engine");
        readingList.add("Plant Care Tips");
        System.out.println(readingList.unread[0]);
        System.out.println(readingList.unread[1]);
        System.out.println(readingList.unread[2]);
        System.out.println(readingList.unread[3]);
    }
}
