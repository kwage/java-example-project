package mysecondpackage.main;

public class Cat extends Pet {

    // Class Varialbes
    private int age;
    private boolean lovesMilk;

    // Constructor
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public Cat(String name, int age, boolean lovesMilk) {
        super(name);
        this.age = age;
        this.lovesMilk = lovesMilk;
    }

    // Methods
    public String getName() { return this.getName(); }

    public int getAge() { return this.age; }

    @Override
    public void makeSound() {
        System.out.println("Mooo!");
    }


    public boolean getLovesMilk() { return this.lovesMilk; }


    public String garfieldMeows() {
        return "Meow";
    }

}
