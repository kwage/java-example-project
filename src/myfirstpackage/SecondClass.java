package myfirstpackage;

import mysecondpackage.main.Dog;

public class SecondClass {

    public static void main(String[] args) {

        int[] nums = {0, 2, 5, 7, 8};
        int index = SecondClass.binarySearch(nums, 8);
        System.out.println(index);


        /*SecondClass sc = new SecondClass();
        SecondClass sc2 = new SecondClass();
        // sc.myMethod();

        // String a = null;
        // String b = null;
        // System.out.println(a == b);

        Dog myDog = new Dog("Frodo", 7);
        Dog mySameDog = new Dog("Stark", 7);

        System.out.println(myDog);
        System.out.println(myDog);
        System.out.println(myDog);
        System.out.println(myDog);
        System.out.println(myDog);

        // System.out.println(myDog.equals(sc));
        // sc.equals(sc2)



        // sc.myMethod();*/
    }

    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = left + ((right - left) / 2);
            if (sortedNumbers[mid] > n) {
                right = mid - 1;
            } else if (sortedNumbers[mid] < n) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public void myMethod() {
        // Dog.taxonomy = "Changed";
        System.out.println(Dog.taxonomy);
        //MyClass var = new MyClass("Something");

        //System.out.println(MyClass.myTestVariable);

        Dog stark = new Dog(5, "Stark", "Smith");

        String theDogsName = stark.getMyDogsName();
        System.out.println("Dogs name: " + theDogsName);

        // stark.setMyDogsName("Toby");
        // theDogsName = stark.getMyDogsName();
        System.out.println("Changed To: " + theDogsName);


        // stark.bark();
    }
}
