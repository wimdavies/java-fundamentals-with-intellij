package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer yearOfCreation;
    String creator;

    public ProgrammingLanguage(String creator, Integer yearOfCreation, String name) {
        this.creator = creator;
        this.yearOfCreation = yearOfCreation;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public String getCreator() {
        return creator;
    }

    public static void main(String[] args) {
        ProgrammingLanguage ruby = new ProgrammingLanguage(
                "Yukihiro Matsumoto",
                1995,
                "Ruby"
        );
        ProgrammingLanguage python = new ProgrammingLanguage(
                "Guido van Rossum",
                1991,
                "Python"
        );
        ProgrammingLanguage java = new ProgrammingLanguage(
                "James Gosling",
                1995,
                "Java"
        );

        System.out.println(ruby.getName());
        System.out.println(ruby.getYearOfCreation());
        System.out.println(ruby.getCreator());

        System.out.println(java.getName());
        System.out.println(java.getYearOfCreation());
        System.out.println(java.getCreator());

        System.out.println(python.getName());
        System.out.println(python.getYearOfCreation());
        System.out.println(python.getCreator());
    }
}
