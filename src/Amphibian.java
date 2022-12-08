import java.util.Objects;

public class Amphibian extends Animals {

    private final String LeavePlace;

    public Amphibian(String name, int age, String leavePlace) {
        super(name, age);
        if (leavePlace == name || leavePlace.isEmpty()) {
            this.LeavePlace = "Не указано";
        } else {
            LeavePlace = leavePlace;
        }
    }

    public String getLeamePlace() {
        return LeavePlace;
    }

    public void hunt() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(LeavePlace, amphibian.LeavePlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), LeavePlace);
    }

    @Override
    public String toString() {
        return "Amphibian" +
                "LeavePlace='" + LeavePlace + '\'' +
                '}';
    }
}
