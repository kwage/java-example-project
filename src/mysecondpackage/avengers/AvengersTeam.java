package mysecondpackage.avengers;

import java.util.HashMap;
import java.util.Map;

public class AvengersTeam {

    // Class Variables
    private HashMap<String, String> theTeam;

    // Constructor
    public AvengersTeam(HashMap<String, String> cookie) {
        this.theTeam = cookie;
    }

    // Methods
    public HashMap<String, String> getTheTeam() { return this.theTeam; }

    public void setTheTeam(HashMap<String, String> myNewTeam) { this.theTeam = myNewTeam; }

    @Override
    public String toString() {
        String returnedTeam = "";
        for(HashMap.Entry<String, String> entry : this.theTeam.entrySet()) {
            returnedTeam += entry.getKey() + ": " + entry.getValue() + "\n";
        }
        return returnedTeam;
    }
}
