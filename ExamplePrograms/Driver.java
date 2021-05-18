package ExamplePrograms;

public class Driver {
    public static void main(String[] args) {
        EnglishPerson p1 = new EnglishPerson("John");
        SpanishPerson p2 = new SpanishPerson("Juan");
        System.out.println(p1.getName() + " " + p1.greet());
        System.out.println(p2.getName() +  " " + p2.greet() + p2.plays());
    }
}