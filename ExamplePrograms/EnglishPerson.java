package ExamplePrograms;

public class EnglishPerson extends Person{
    public static void main(String[] args) {
        EnglishPerson p1 = new EnglishPerson();
        System.out.println(p1.getName() + p1.greet());
        
    }
    @Override
    public String greet() {
        return "John says: Hello. Welcome!";
    }

}