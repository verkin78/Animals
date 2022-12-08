import java.util.Objects;

public class Herbivore extends Mammal{
    private String food;

    public Herbivore(String name, int age, String habitat, int speedMove, String food) {
        super(name, age, habitat, speedMove);
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (food == null || food.isEmpty()) {
            this.food = "Любая трава";
        } else {
            this.food = food;
        }
    }

    public void graze() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(food, herbivore.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    @Override
    public String toString() {
        return "Травоядное, {" +
                "ест " + food + '\n' +
                '}';
    }
}
