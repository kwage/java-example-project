package mysecondpackage.tests;

import org.junit.Before;
import org.junit.Test;
import mysecondpackage.main.Cat;

import static org.junit.Assert.*;

public class CatTests {

    Cat myCat;
    Cat mySecondCat;

    @Before
    public void setUpCatTests() {
        this.myCat = new Cat("Bella", 7, true);
        this.mySecondCat = new Cat("Rob", 3, false);
    }

    @Test
    public void catsNameGetsSet() {
        String expected = "Bella";
        String actual = this.myCat.getName();
        assertEquals("Bella", actual);
    }

    @Test
    public void catsAgeGetsSet() {
        int expected = 7;
        int actual = this.myCat.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void catReturnsMeow() {
        String expected = "Meow";
        String actual = this.myCat.garfieldMeows();
        assertEquals(expected, actual);
    }

    @Test
    public void catLovesMilkReturnsTrue() {
        boolean actual = this.myCat.getLovesMilk();
        assertTrue(actual);
    }

    @Test
    public void catLovesMilkReturnsFalse() {
        boolean actual = this.mySecondCat.getLovesMilk();
        assertFalse(actual);
    }

}
