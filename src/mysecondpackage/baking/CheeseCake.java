package mysecondpackage.baking;

public class CheeseCake extends Cake implements Food {
    public CheeseCake(int sweetnessScale) {
        super(sweetnessScale);
    }

    @Override
    public void taste() {
        System.out.println("Sweet cheesy goodness");
    }

    @Override
    public void judgesReaction() {
        System.out.println("A clear winner!");
    }

    @Override
    public void cook() {
        System.out.println("Delicious");
    }
}
