import java.util.Comparator;


public class NameComparator implements Comparator<Human> {

    private final String name;

    public NameComparator(String name) {
        this.name = name;
    }

    @Override
    public int compare(Human o1, Human o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
