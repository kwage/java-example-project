package mysecondpackage.baking;

import mysecondpackage.main.Cat;
import mysecondpackage.main.Dog;
import mysecondpackage.main.Pet;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // int arr[] = {1,2,3};
        // int badIndex = arr[4];

        try {
            pleasePassMeADog(new Dog("LOL NO", 7));
        } catch(Exception ex) {
            // Actually do somethihng to help
            System.out.println("ERROR: " + ex.getMessage());
        }

        try {
            pleasePassMeADog(new Cat("LOL NO"));
        } catch(Exception ex) {
            // Actually do somethihng to help
            System.out.println("ERROR: " + ex.getMessage());
        }

        // String nullString = null;
        // nullString.toUpperCase();



        // Cake myChocolateCake = new ChocolateCake(7);
        // Cake myCheeseCake = new CheeseCake(8);

        // ArrayList<Cake> myCakes = new ArrayList<>(Arrays.asList(myChocolateCake, myCheeseCake));

        // myCakes.add(myChocolateCake);
        // myCakes.add(myCheeseCake);

        // myChocolateCake.taste();
        // myCheeseCake.taste();

        //for (Cake bird : myCakes) {
        //    bird.taste();
        //}

    }

    public static void pleasePassMeADog(Pet pet) throws Exception {
        try {
            Dog myDog = (Dog) pet;
        } catch (ClassCastException exc) {
            // System.out.println("");
            throw new Exception("This was not a dog!!");
        }
    }
}
