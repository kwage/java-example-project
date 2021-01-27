package myfirstpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyClass {

    public static String myTestVariable = "Test";
    public static void main(String[] args) {
        String theSeason = new String("Winter");
        String theSeason2 = new String("Winter");
        int inchesOfSnow = 2;

        // System.out.println("hello world");

        /*if(inchesOfSnow == 2) {
            System.out.println("School is canceled!");
        }*/

        /*if (theSeason.equals("Winter")) {
            System.out.println("Winter is here");
        } else if (theSeason.equals("Spring")) {
            System.out.println("Its spring");
        } else if (theSeason.equals("Summer")) {
            System.out.println("Its summer");
        } else if (theSeason.equals("Fall")) {
            System.out.println("Its false");
        } else {
            System.out.println("This is not a season");
        }

        switch(theSeason) {
            case "Winter":
            case "Spring":
                System.out.println("My favorite seasons");
                break;
            case "Summer":
                System.out.println("Its summer");
                break;
            case "Fall":
                System.out.println("Its fall");
                break;
            default:
                System.out.println("This is not a season");
                break;
        }*/

        String[] seasons = { "Winter", "Spring", "Summer", "Fall"};

        int[] arrtayOfInts = { 1, 2};

        for(int i : arrtayOfInts) {
            i = 7;
        }

        // System.out.println(Arrays.toString(arrtayOfInts));
        /*for(int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }*/

        for(String season : seasons) {
            season = "Summer";
        }

        /*for(int i = 0; i < seasons.length; i++) {
            seasons[i] = seasons[i].toUpperCase();
        }*/
        // System.out.println(seasons);
        // System.out.println(Arrays.toString(seasons));


        int daysOfWinter = 0;

        while(daysOfWinter != 0) {
            // daysOfWinter = daysOfWinter - 1;
            // daysOfWinter--;
            System.out.println("FIRST ONE #" + daysOfWinter);
        }

        do {
            // daysOfWinter = daysOfWinter - 1;
            // daysOfWinter--;
            System.out.println("SECOND ONE #" + daysOfWinter);
        } while(daysOfWinter != 0);

        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Dog", "cat"));
        myList.set(0, "Puppy");
        System.out.println(myList);


        HashMap<String, String> myMap = new HashMap<>();

        // ArrayList<int> theArray = new ArrayList<int>();

        myMap.put("Thing1", "Hello");
        myMap.put("Thing2", "Another thing");

        for(String key : myMap.keySet()) {
            System.out.println(key + " is for: " + myMap.get(key));
        }

        System.out.println(myMap.get("Thing1"));

        //System.out.println(daysOfWinter);





    }

    private final String value;

    public MyClass(String value) {
        this.value = value;
    }

}
