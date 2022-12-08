import java.util.Objects;

public class Flying extends Bird{
    private String move;

    public Flying(String name, int age, String leavePlace, String move) {
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

    public void flught() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(move, flying.move);
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
