import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
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


    @Test
    public void testComparator() throws Exception {
        Human petya = new Human("Petya", (Calendar) new GregorianCalendar(1990, 0, 1), 10000);
        Human vasya = new Human("Vasya", (Calendar) new GregorianCalendar(1989, 0, 1), 10001);
        Human boris = new Human("Boris", (Calendar) new GregorianCalendar(1990, 1, 1), 10002);
        Human zaxar = new Human("Zaxar", (Calendar) new GregorianCalendar(1992, 1, 1), 10003);
        Human anton = new Human("Anton", (Calendar) new GregorianCalendar(1992, 0, 1), 10004);

        Human[] mans = new Human[]{petya, vasya, boris, zaxar, anton};

        System.out.println("========== sorted by name ===========");
        Human[] sortedName = mans.clone();
        Arrays.sort(sortedName,new NameComparator());
        for(Human man : sortedName) {
            System.out.println("Name: " + man.getName() +
                    " birth: " + new SimpleDateFormat("dd-MMM-yyyy").format(man.getBirthday().getTime()));
        }

        System.out.println("========== sorted by Age ===========");
        Human[] sortedAge = mans.clone();
        Arrays.sort(sortedAge,new AgeComparator());
        for(Human man : sortedAge) {
            System.out.println("Name: " + man.getName() +
                    " birth: " + new SimpleDateFormat("dd-MMM-yyyy").format(man.getBirthday().getTime()));
        }
    }
}