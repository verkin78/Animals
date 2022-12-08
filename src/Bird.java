import java.util.Objects;

public class Bird extends Animals{
    private final String LeavePlace;

    public Bird(String name, int age, String leavePlace) {
        super(name, age);
        if (leavePlace == name || leavePlace.isEmpty()) {
            this.LeavePlace = "Не указано";
        } else {
            LeavePlace = leavePlace;
        }
    }

    public String getLeavePlace() {
        return LeavePlace;
    }

    public void hunt() {
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(LeavePlace, bird.LeavePlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), LeavePlace);
    }

    @Override
    public String toString() {
        return "Bird" +
                "LeavePlace='" + LeavePlace + '\'' +
                '}';
    }
}
