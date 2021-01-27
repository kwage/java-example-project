package mysecondpackage.main;

public class Cat {

    // Class Varialbes
    private String name;
    private int age;
    private boolean lovesMilk;

    // Constructor
    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, boolean lovesMilk) {
        this.name = name;
        this.age = age;
        this.lovesMilk = lovesMilk;
    }

    // Methods
    public String getName() { return this.name; }

    public int getAge() { return this.age; }

    public boolean getLovesMilk() { return this.lovesMilk; }


    public String garfieldMeows() {
        return "Meow";
    }

}
