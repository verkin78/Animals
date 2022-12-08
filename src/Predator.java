import java.util.Objects;

public class Predator extends Mammal{
    private  String food;

    public Predator(String name, int age, String habitat, int speedMove, String food) {
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

    public void hunt() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(food, predator.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    @Override
    public String toString() {
        return "Кличка " + getName() + ", возраст: " + getAge() + " лет." + "\n"
                + "Среда обитания: " + getHabitat() + ". Максимальная скорость: " + getSpeedMove() + " км/час." + "\n"
                + getClass() + ", хищник, ест " + food + "." + '\n';
    }
}
