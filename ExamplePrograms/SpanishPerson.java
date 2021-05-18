package ExamplePrograms;

public class SpanishPerson extends Person {
    
    public SpanishPerson(String name) {
        super(name);
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