package ExamplePrograms; 

public abstract class Person implements Game {
    private String name;
   
    public abstract String greet();    

    public  String getName() {
        return name;
    }
}