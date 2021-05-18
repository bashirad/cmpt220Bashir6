package ExamplePrograms;

public class EnglishPerson extends Person{
    
    public EnglishPerson(String name) {
        super(name);
    } 

    @Override
    public String greet() {
        return "Hello. Welcome!";
    }

    @Override
    public String plays() {
        return "PLays Basketball";
    }

}