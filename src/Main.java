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
        if (personsAge < 7) {
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
        // Мой первый вариант решения
        System.out.println("_Мой первый вариант решения:_");
        int trainsCarCapacity = 102;
        int seats = 60;

        int passengers = 102; // Кол-во пассажиров, уже купивших билет (при условии, что сначала занимаются сидячие, а потом стоячие места)
        if (passengers < seats) {
            System.out.println("Проезд возможен, с посадочным местом.");
        }
        if (passengers >= seats && passengers < trainsCarCapacity) {
            System.out.println("Проезд возможен, без посадочного места.");
        }
        if (passengers == trainsCarCapacity) {
            System.out.println("Мест нет.");
        }

        // Вариант решения после просмотра разбора дз:
        System.out.println("_Вариант решения после просмотра разбора дз:_");
        int capacity = 102;
        int seatsCount = 60;
        int standingCount = capacity - seatsCount;

        int seatsTaken = 60;
        int standingTaken = 42;

        if (seatsTaken < seatsCount) {
            System.out.println("Осталось " + (seatsCount - seatsTaken) + " посадочных мест.");
        }
        if (seatsTaken == seatsCount) {
            System.out.println("Посадочных мест нет.");
        }
        if (standingTaken < standingCount) {
            System.out.println("Осталось " + (standingCount - standingTaken) + " стоячих мест.");
        }
        if (standingTaken == standingCount) {
            System.out.println("Стоячих мест нет.");
        }

    }
}