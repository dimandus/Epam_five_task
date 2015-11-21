import org.junit.Test;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;


public class HumanTest {

    @Test
    public void testToString() throws Exception {

    }

    @Test
    public void testCompareTo() throws Exception {
        Human petya = new Human("Petya", (Calendar) new GregorianCalendar(1990, 1, 1), 10000);
        Human petyaBrother = new Human("Anton", (Calendar) new GregorianCalendar(1990, 1, 1), 10001);
        Human otherPetya = new Human("Petya", (Calendar) new GregorianCalendar(1991, 1, 1), 10002);

        assertTrue("Документ меньше", petya.compareTo(petyaBrother) < 0);
        assertTrue("Старше", petya.compareTo(otherPetya) > 0);
    }


}