public class Main {
    public static void main(String[] args) {
        // Задача 1
        int ageAnton = 18;
        if (ageAnton >= 18) {
            System.out.println("Если возраст Антона равен 18 или больше лет, то он совершеннолетний");
        }
        int ageKate = 17;
        if (ageKate < 18) {
            System.out.println("Если возраст Екатерины меньше 18 лет, то она не достигла совершеннолетия, нужно немного подождать Антону)))");
        }
        // Задача 2
        int temperature = 5;
        if (temperature >= 5) {
            System.out.println("На улице выше 5 градусов, можно идти без шапки");
        } else {
            System.out.println("На улице ниже 5 градусов, нужно надеть шапку");
        }
        if (temperature < 5) {
            System.out.println("На улице выше 5 градусов, можно идти без шапки");
        } else {
            System.out.println("На улице ниже 5 градусов, нужно надеть шапку");
        }
        // Задача 3 Доработано
        int speedCar = 65;
        if (speedCar > 60) {
            System.out.println("Если скорость автомобиля свыше 60 км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость автомобиля ниже 60 км/ч, то можно ездить спокойно.");
        }
        if (speedCar < 60) {
            System.out.println("Если скорость автомобиля свыше 60 км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость автомобиля ниже 60 км/ч, то можно ездить спокойно.");
        }
        // Задача 4
        int ageArtem = 5;
        if (ageArtem >= 2 && ageArtem <= 6) {
            System.out.println("Если возраст человека равен от 2 до 6 лет, то ему нужно ходить в детский сад.");
        }
        int ageMari = 15;
        boolean ageMariGoToSchool = ageMari >= 7 && ageMari <= 17;
        if (ageMariGoToSchool) {
            System.out.println("Если возраст человека равен от 7 до 17 лет, то ему нужно ходить в школу.");
        }
        int ageAlex = 20;
        boolean ageAlexGoToUniversity = ageAlex >= 18 & ageAlex <= 24;
        if (ageAlexGoToUniversity) {
            System.out.println("Если возраст человека равен 18 лет или больше, но меньше или равен 24 года, то его место в университете.");
        }
        int ageAnna = 30;
        if (ageAnna > 24) {
            System.out.println("Если возраст человека больше 24 лет, то ему пора ходить на работу.");
        }
        // Задача 5
        int ageChild = 3;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен меньше 5 лет, то ему нельзя кататься на аттракционе.");
        }
        int ageChild10 = 10;
        int parent = 2;
        boolean canRideAttractionWithParent = ageChild10 > 5 & ageChild10 < 14 & parent >= 1;
        if (canRideAttractionWithParent) {
            System.out.println("Если возраст ребенка равен больше 5 лет, но меньше 14 лет, то можно кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        int ageChild15 = 15;
        if (ageChild15 > 14) {
            System.out.println("Если ребенок старше 14 лет, то он может кататься на аттракционе без сопровождения взрослого.");
        }
        // Задача 6 Доработано
        int trainCarriageAllPlace = 102; // 52 // 7
        int trainCarriageAllSeatsPlace = 60; // 30 // 0
        int trainCarriageAllStandPlace = 102 - 60; // 22 // 7
        int peopleInAdlerSeatsPlace = 30;
        int peopleInAdlerStandPlace = 20;
        trainCarriageAllPlace = trainCarriageAllPlace - (peopleInAdlerStandPlace + peopleInAdlerSeatsPlace);
        trainCarriageAllSeatsPlace = trainCarriageAllSeatsPlace - peopleInAdlerSeatsPlace;
        trainCarriageAllStandPlace = trainCarriageAllStandPlace - peopleInAdlerStandPlace;
        if (trainCarriageAllPlace > 0 & trainCarriageAllSeatsPlace > 0 & trainCarriageAllStandPlace > 0) {
            System.out.println("В Адлере зашли люди в поезд и в нашем вагоне остались еще свободные места в кол-ве " + trainCarriageAllPlace + " штук, из них сидячих мест осталось " + trainCarriageAllSeatsPlace + " штук, а стоячих " + trainCarriageAllStandPlace + " места.");
        }
        int peopleInKrasnodarSeatsPlace = 30;
        int peopleInKrasnodarStandPlace = 15;
        trainCarriageAllPlace = trainCarriageAllPlace - (peopleInKrasnodarSeatsPlace + peopleInKrasnodarStandPlace);
        trainCarriageAllSeatsPlace = trainCarriageAllSeatsPlace - peopleInAdlerSeatsPlace;
        trainCarriageAllStandPlace = trainCarriageAllStandPlace - peopleInKrasnodarStandPlace;
        if (trainCarriageAllPlace > 0 & trainCarriageAllSeatsPlace > 0 & trainCarriageAllStandPlace > 0) {
            System.out.println("В Краснодаре зашли люди в поезд и в нашем вагоне остались еще свободные места в кол-ве " + trainCarriageAllPlace + " штук, из них сидячих мест осталось " + trainCarriageAllSeatsPlace + " штук, а стоячих " + trainCarriageAllStandPlace + " места.");
        } else {
            System.out.println("В Краснодаре зашли люди в поезд и в нашем вагоне остались еще свободные места в кол-ве " + trainCarriageAllPlace + " штук, из них сидячих мест больше нет, а стоячих осталось " + trainCarriageAllStandPlace + " мест.");
        }
        int peopleInVolgogradStandPlace = 7;
        trainCarriageAllPlace = trainCarriageAllPlace - peopleInVolgogradStandPlace;
        trainCarriageAllStandPlace = trainCarriageAllStandPlace - peopleInVolgogradStandPlace;
        if (trainCarriageAllPlace > 0) {
            System.out.println("В Волгограде зашли люди в поезд и в нашем вагоне всего осталось " + trainCarriageAllPlace + " мест.");
        } else if (trainCarriageAllSeatsPlace > 0 || trainCarriageAllStandPlace > 0) {
            System.out.println("В Волгограде зашли люди в поезд и в нашем вагоне вдруг осталось " + trainCarriageAllSeatsPlace + " сидячих " + trainCarriageAllStandPlace + " стоячих мест.");
        } else {
            System.out.println("После того, как в Волгограде зашли люди в поезд, вагон стал уже полностью забит, свободных мест нет.");
        }

        // Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число один большее из трех чисел: 1, 2, 3");
        } else if (two > one && two > three) {
            System.out.println("Число два большее из трех чисел: 1, 2, 3");
        } else {
            System.out.println("Число три большее из трех чисел: 1, 2, 3");
        }

    }
}
