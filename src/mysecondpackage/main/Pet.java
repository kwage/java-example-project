package mysecondpackage.main;

public abstract class Pet {
    private String name;
    private int id;

    public Pet(String name) {
        this.name = name;
        this.id = id;
    }

    public Pet(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return this.name; }

    public abstract void makeSound();
}
