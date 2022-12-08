public class Main {

    public static void main(String[] args) {

        Herbivore gazelle = new Herbivore("газель Соня", 3, "Саванна", 150,
                "свежая трава и сено");
        Herbivore giraffe = new Herbivore("жираф Гоша", 4, "Прерии", 115,
                "трава, некоторые овощи и фрукты");
        Herbivore horse = new Herbivore("конь Тимур", 7, "Средняя полоса", 90,
                "сено, силос, трава");
        Predator hyena = new Predator("гиена Маня", 2, "Пустыня", 75,
                "падаль и мелкие животные");
        Predator tiger = new Predator("тигр Ани", 8, "Лесо-степь", 85,
                "сырое мясо");
        Predator bear = new Predator("медведь Вася", 2, "Леса", 60, "мясо");
        Amphibian frog = new Amphibian("лягушка Настя", 1, "Пруд");
        Amphibian waterSnake = new Amphibian("уж Макс", 6, "У лесных рек");
        Flightless peacock = new Flightless("павлин Веня", 4, "Джунгли", "ходит");
        Flightless penguin = new Flightless("пингвин Люся", 5, "Южный полюс", "ходит и плавает");
        Flightless dodoBird = new Flightless("прица Додо Гром", 2, "", "прыгает");
        Flying gull = new Flying("чайка Крис", 3, "Побережье больших водоёмов",
                "летает, ходит, плавает");
        Flying albatross = new Flying("альбатрос Ксюша", 1, "вблизи водоёмов, на скалах",
                "летает");
        Flying falcon = new Flying("сокол Кир", 9, "горная местность", "летает, пекирует");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(waterSnake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
    }

}