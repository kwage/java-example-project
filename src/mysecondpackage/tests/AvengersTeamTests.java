package mysecondpackage.tests;

import mysecondpackage.avengers.AvengersTeam;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class AvengersTeamTests {

    @Test
    public void doesTheConstructorSetVariables() {
        HashMap<String, String> theTeam = new HashMap<>();
        theTeam.put("Tony Stark", "rich & genius");
        theTeam.put("Winter Soldier", "Super soldier");
        theTeam.put("Thor", "demi-god");
        AvengersTeam team = new AvengersTeam(theTeam);
        HashMap<String, String> expected = team.getTheTeam();
        assertEquals(theTeam, expected);
    }

    @Test
    public void doesToStringMethodWork() {
        HashMap<String, String> theTeam = new HashMap<>();
        theTeam.put("Tony Stark", "rich & genius");
        theTeam.put("Winter Soldier", "Super soldier");

        AvengersTeam team = new AvengersTeam(theTeam);
        String actual = team.toString();
        String expected = "Tony Stark: rich & genius\n" +
                "Winter Soldier: Super soldier\n";

        assertEquals(expected, actual);
    }

}
