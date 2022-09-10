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

        // ДЗ 2 Задача 1
        System.out.println("ДЗ 2 Задача 1");
        int age1 = 30;
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Вы ещё не достигли совершеннолетия.");
        }

        //ДЗ 2 Задача 2
        System.out.println("ДЗ 2 Задача 2");
        int personsAge1 = 23;
        if (personsAge1 <7) {
            System.out.println("Этот ребёнок ещё не ходит в школу");
        } else if (personsAge1 >= 7 && personsAge1 < 18) {
            System.out.println("Этот ребёнок ходит в школу.");
        } else if (personsAge1 >= 18 && personsAge1 < 24) {
            System.out.println("Этот человек закончил(а) школу и учится в университете.");
        } else {
            System.out.println("Этот человек окончил(а) университет и работает.");
        }

        // ДЗ 2 Задача 3
        System.out.println("ДЗ 2 Задача 3");
        // Мой первый вариант решения
        System.out.println("_Мой первый вариант решения:_");
        int trainsCarCapacity1 = 102;
        int seats1 = 60;

        int passengers1 = 102; // Кол-во пассажиров, уже купивших билет (при условии, что сначала занимаются сидячие, а потом стоячие места)

        if (passengers1 < seats1) {
            System.out.println("Проезд возможен, с посадочным местом.");
        } else if (passengers1 >= seats1 && passengers1 < trainsCarCapacity1) {
            System.out.println("Проезд возможен, без посадочного места.");
        } else {
            System.out.println("Мест нет.");
        }

        // Вариант решения после просмотра разбора дз:
        System.out.println("_Вариант решения после просмотра разбора дз:_");

        int capacity1 = 102;
        int seatsCount1 = 60;
        int standingCount1 = capacity1 - seatsCount1;

        int seatsTaken1 = 60;
        int standingTaken1 = 42;

        if (seatsTaken1 < seatsCount1) {
            System.out.println("Осталось " + (seatsCount1 - seatsTaken1) + " посадочных мест.");
        } else {
            System.out.println("Посадочных мест нет.");
        }
        if (standingTaken1 < standingCount1) {
            System.out.println("Осталось " + (standingCount1 - standingTaken1) + " стоячих мест.");
        } else {
            System.out.println("Стоячих мест нет.");
        }

        // ДЗ 3 Задача 1
        System.out.println("ДЗ 3 Задача 1");
        int yearsOld = 26;
        boolean kindergarten = yearsOld >= 2 && yearsOld < 7;
        boolean school = yearsOld >= 7 && yearsOld < 18;
        boolean uni = yearsOld >= 18 && yearsOld < 24;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ей/ему нужно ходить в детский сад.");
        } else if (school) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ей/ему нужно ходить в школу.");
        } else if (uni) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ей/ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ей/ему нужно ходить на работу.");
        }

        // ДЗ 3 Задача 2
        System.out.println("ДЗ 3 Задача 2");
        int childsAge = 14;
        boolean canRideAlone = childsAge >= 14;
        boolean canRideWithParent = childsAge >= 5 && childsAge < 14;
        if (canRideAlone) {
            System.out.println("Если ребёнку " + childsAge + " лет, то он(а) может кататься на атракционе без сопровождения взрослого.");
        } else if (canRideWithParent) {
            System.out.println("Если ребёнку " + childsAge + " лет, то он(а) может кататься на аттракционе только в сопровождении взрослого.");
        } else {
            System.out.println("Если ребёнку " + childsAge + " год(а), то ей/ему запрещено кататься на аттракционе.");
        }

        // ДЗ 3 Задача 3
        System.out.println("ДЗ 3 Задача 3");
        int one = 1;
        int two = 10;
        int three = 10;
        if (three > two) {
            if (three >= one) {
                System.out.println("Число " + three + " - наибольшее.");
            } else {
                System.out.println("Число " + one + " - наибольшее.");
            }
        } else if (two > three) {
            if (two >= one) {
                System.out.println("Число " + two + " - наибольшее.");
            } else {
                System.out.println("Число " + one + " - наибольшее.");
            }
        } else if (three > one) {
            System.out.println("Число " + three + " - наибольшее.");
                } else if (one > three) {
            System.out.println("Число " + one + " - наибольшее.");
        } else {
            System.out.println("Все числа равны.");
        }

    }
}