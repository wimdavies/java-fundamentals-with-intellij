package bites.examples;

public class TenDayDiary implements GenericDiary {
    String[] entries = new String[10];

    @Override
    public void addEntry(String diaryEntry) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
               entries[i] = diaryEntry;
               break;
            }
        }
    }

    @Override
    public void removeEntry(int index) {
        entries[index] = null;
    }

    @Override
    public String readEntry(int index) {
        return entries[index];
    }

    public static void main(String[] args) {
        TenDayDiary tenDayDiary = new TenDayDiary();
        tenDayDiary.addEntry("Nice day today");
        tenDayDiary.addEntry("Crap day today");
        System.out.println(tenDayDiary.readEntry(0));
        System.out.println(tenDayDiary.readEntry(1));
        tenDayDiary.removeEntry(0);
        System.out.println(tenDayDiary.readEntry(0));
        System.out.println(tenDayDiary.readEntry(1));
        tenDayDiary.addEntry("A third entry");
        System.out.println(tenDayDiary.readEntry(0));
        System.out.println(tenDayDiary.readEntry(1));
        System.out.println(tenDayDiary.readEntry(2));
    }
}
