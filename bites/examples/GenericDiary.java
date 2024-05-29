package bites.examples;

public interface GenericDiary {
    void addEntry(String diaryEntry);
    void removeEntry(int index);
    String readEntry(int index);
}
