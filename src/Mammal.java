import java.util.Objects;

public class Mammal extends Animals{
    private final String habitat;
    private  int speedMove;

    public Mammal(String name, int age, String habitat, int speedMove) {
        super(name, age);
        this.habitat = habitat;
        setSpeedMove(speedMove);
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeedMove() {
        return speedMove;
    }

    public void setSpeedMove(int speedMove) {
        if (speedMove <= 0) {
            this.speedMove = 1;
        } else {
            this.speedMove = speedMove;
        }
     }

    public void walk() {
        System.out.println("Я иду гулять");
        System.out.println("Я поел");
    }

    @Override
    public void eat() {
        System.out.println("Я приступаю к еде");
        System.out.println("Прогулка окончена");
    }

    @Override
    public void move() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speedMove == mammal.speedMove && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speedMove);
    }

    @Override
    public String toString() {
        return "Mammal" +
                "habitat='" + habitat + '\'' +
                ", speedMove=" + speedMove +
                '}';
    }
}
