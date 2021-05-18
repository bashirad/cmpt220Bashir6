package ExamplePrograms; 

public abstract class Person implements Game {
    private String name;
   
    public abstract String greet();    

    public Person(String name){
        this.name = name;
    }

    public  String getName() {
        return name;
    }
}