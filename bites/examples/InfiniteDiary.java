package bites.examples;

import java.util.ArrayList;

public class InfiniteDiary implements GenericDiary {
    ArrayList<String> entries = new ArrayList<>();

    @Override
    public void addEntry(String diaryEntry) {
        entries.add(diaryEntry);
    }

    @Override
    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String readEntry(int index) {
        return entries.get(index);
    }

    public static void main(String[] args) {
        InfiniteDiary infiniteDiary = new InfiniteDiary();
        infiniteDiary.addEntry("Nice day today");
        infiniteDiary.addEntry("Crap day today");
        System.out.println(infiniteDiary.readEntry(0));
        infiniteDiary.removeEntry(0);
        System.out.println(infiniteDiary.readEntry(0));
    }
}
