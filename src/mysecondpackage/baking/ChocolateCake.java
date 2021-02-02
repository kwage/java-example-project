package mysecondpackage.baking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChocolateCake extends Cake implements Food {

    public ChocolateCake(int sweetnessScale) {
        super(sweetnessScale);
    }

    @Override
    public void taste() {
        System.out.println("So chocolatey!");
    }

    @Override
    public void judgesReaction() {
        System.out.println("Awesome choco goodness!");
    }

    @Override
    public void cook() {
        System.out.println("Smells great");
    }
}
