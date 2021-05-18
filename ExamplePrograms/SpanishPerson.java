package ExamplePrograms;

public class SpanishPerson extends Person implements Game {
    public static void main(String[] args) {
        SpanishPerson p2 = new SpanishPerson();
        System.out.println(p2.getName() + p2.greet() + p2.plays());
    }
    @Override
    public String greet() {
        return "Hola. Bienvenido!";
    }

    @Override
    public String plays() {
        return " and plays Soccer";
    }
}