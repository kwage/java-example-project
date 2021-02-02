package mysecondpackage.baking;

public abstract class Cake implements Dessert {

    private int sweetnessScale;

    public Cake(int sweetnessScale) {
        this.sweetnessScale = sweetnessScale;
    }

    public int getSweetnessScale() { return this.sweetnessScale; }

    public void setSweetnessScale(int sweetnessScale ) { this.sweetnessScale = sweetnessScale; }

    public void taste() {
        System.out.println("Can't really tell what kind of cake this is...");
    }

}
