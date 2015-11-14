import java.util.Comparator;
import java.util.Date;

public class AgeComparator implements Comparator<Human> {

    private final Date birthday;

    public AgeComparator(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirthday().before(o2.getBirthday()) ? 1 : 0;
    }
}
