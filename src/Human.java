import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Human implements Comparable<Human> {
    private String name;
    private Calendar birthday;
    private int passportNumber;

    public Human(String name, Calendar birthday, int passportNumber) {
        this.name = name;
        this.birthday = (Calendar) birthday.clone();
        this.passportNumber = passportNumber;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getName() {

        return name;

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Human o) {

        if (!birthday.equals(o.birthday)) {
            return birthday.before(o.birthday) ? 1 : 0;
        } else {
            if (passportNumber != o.passportNumber) {
                return passportNumber - o.passportNumber;
            }
        }

        return 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (passportNumber != human.passportNumber) return false;
        if (!name.equals(human.name)) return false;
        return birthday.equals(human.birthday);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + birthday.hashCode();
        result = 31 * result + passportNumber;
        return result;
    }
}
