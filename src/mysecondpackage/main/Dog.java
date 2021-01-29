package mysecondpackage.main;

public class Dog extends Pet {

    // Class Variables
    public static final String taxonomy = "Canis";

    private int myDogsAge;
    private final String myDogsLastName;


    // Constructor
    public Dog(String firstName, String lastName, int dogsAge) {
        super(firstName);
        this.myDogsLastName = lastName;
        this.myDogsAge = dogsAge;
    }

    public Dog(int dogsAge, String firstName, String lastName) {
        super(1, firstName);

        this.myDogsLastName = lastName;
        this.myDogsAge = dogsAge;
    }

    public Dog(String dogsName, int dogsAge) {
        super( 1, dogsName);
        this.myDogsAge = dogsAge;
        this.myDogsLastName = "";
    }

    public Dog(int dogsAge) {
        this("stark", "smith", 5);
    }

    // Getters and Setters

    public String getMyDogsName() { return this.getName(); }

    // public void setMyDogsName(String dogsName) { this.myDogsName = dogsName; }

    // Method

    public void bark() { System.out.println("Bark"); }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }


    @Override
    public String toString() {
        return "My dogs name is: " + this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            System.out.println("something");
            return true;
        }
        if (!(obj instanceof Dog)) return false;
        Dog dog = (Dog) obj;
        if (dog.getName().equals(this.getName())) return true;
        else return false;
    }
}
