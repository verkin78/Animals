import java.util.Objects;

public class Flightless extends Bird{
    private String move;

    public Flightless(String name, int age, String leavePlace, String move) {
        super(name, age, leavePlace);
        setMove(move);
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        if (move == null || move.isEmpty()) {
            this.move = "Неизвестный способ передвижения. ";
        } else {
            this.move = move;
        }
    }

    public void walk() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return move.equals(that.move);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), move);
    }

    @Override
    public String toString() {
        return "Кличка " + getName() + ", возраст: " + getAge() + " лет." + "\n"
                + "Среда обитания: " + getLeavePlace() + ". Способ перемещения: " + move + "." + "\n"
                + getClass() + ", нелетающая птица." + '\n';
    }
}
