public class Main {
    public static void main(String[] args) {
        // ДЗ 1 Задача 1
        System.out.println("ДЗ 1 Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Вы ещё не достигли совершеннолетия.");
        }

        // ДЗ 1 Задача 2
        System.out.println("ДЗ 1 Задача 2");
        int personsAge = 25;
        if (personsAge <7) {
            System.out.println("Этот ребёнок ещё не ходит в школу");
        }
        if (personsAge >= 7 && personsAge < 18) {
            System.out.println("Этот ребёнок ходит в школу.");
        }
        if (personsAge >= 18 && personsAge < 24) {
            System.out.println("Этот человек закончил(а) школу и учится в университете.");
        }
        if (personsAge >= 24) {
            System.out.println("Этот человек окончил(а) университет и работает.");
        }

        // ДЗ 1 Задача 3
        System.out.println("ДЗ 1 Задача 3");
        int trainsCarCapacity = 102;
        int seats = 60;
        int passengersNumber = 103;
        if (passengersNumber <=seats) {
            System.out.println("Проезд возможен, с посадочным местом.");
        }
        if (passengersNumber > seats && passengersNumber <= trainsCarCapacity) {
            System.out.println("Проезд возможен, без посадочного места.");
        }
        if (passengersNumber > trainsCarCapacity) {
            System.out.println("Мест нет.");
        }

    }
}