package mysecondpackage.baking;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        Cake myChocolateCake = new ChocolateCake(7);
        Cake myCheeseCake = new CheeseCake(8);

        ArrayList<Cake> myCakes = new ArrayList<>(Arrays.asList(myChocolateCake, myCheeseCake));

        // myCakes.add(myChocolateCake);
        // myCakes.add(myCheeseCake);

        // myChocolateCake.taste();
        // myCheeseCake.taste();

        for (Cake bird : myCakes) {
            bird.taste();
        }

    }
}
