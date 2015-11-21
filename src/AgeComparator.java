import java.util.Comparator;
import java.util.Date;

public class AgeComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
