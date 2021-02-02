package mysecondpackage.baking;

public interface Dessert {

    void judgesReaction();

    default int score() {
        return 10;
    }

}
