public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 40000;
        byte b = 100;
        short c = 10000;
        long d = 1000000;
        float e = 3.76f;
        double f = 2.65;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }

    public static void task2() {
        System.out.println("Задача 2");
        byte b = 67;
        short c = -159;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 2.786;
        short g = 569;
        short r = 27897;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(r);

    }

    public static void task3() {
        System.out.println("Задача 3");
        var totalPaper = 480;
        var totalClass = 3;
        var LydmilaPalovna = 23;
        var AnnaSergeevna = 27;
        var EkaterinaAndreevna = 30;
        int totalStudents = LydmilaPalovna + AnnaSergeevna + EkaterinaAndreevna;
        int listOneStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + listOneStudent + " листов бумаги».");

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte min = 20;
        short day1 = 1440;
        int oneMonth = 43200;
        byte makingBottle = 8;
        byte makingMin = 1;
        int min20 = (makingMin * min) * makingBottle;
        int day = day1 * makingBottle;
        int day3 = day * 3;
        int month = oneMonth * makingBottle;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок».");
        System.out.println("За сутки машина произвела " + day + " штук бутылок».");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок».");
        System.out.println("За месяц машина произвела " + month + " штук бутылок».");
    }

    public static void task5() {
        System.out.println("Задача 5");

        byte totalCans = 120;
        byte oneClassWhiteCans = 2;
        byte oneClassBrownCans = 4;
        int totalCansClass = oneClassWhiteCans + oneClassBrownCans;
        int totalClass = totalCans / totalCansClass;
        int totalWhiteCans = totalClass * oneClassWhiteCans;
        int totalBrownCans = totalClass * oneClassBrownCans;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte oneBananasGr = 80;
        short milk = 200;
        byte oneMilkGr = 105;
        byte IceCreamSundae = 2;
        byte oneCreamSundaeGr = 100;
        byte RawEggs = 4;
        byte oneRawEggsGr = 70;
        long totalGr = (bananas * oneBananasGr) + (oneMilkGr * 2) + (IceCreamSundae * oneCreamSundaeGr) + (oneRawEggsGr * RawEggs);
        float totalKg = totalGr / 1000f;
        System.out.println("Вес спортзавтрака, составило " + totalGr + " гр");
        System.out.println("Вес спортзавтрака, составило " + totalKg + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte totalResetKg = 7;
        short oneOptionGr = 250;
        short twoOptionGr = 500;
        int optionOneGr = (totalResetKg * 1000) / oneOptionGr;
        int optionTwoGr = (totalResetKg * 1000) / twoOptionGr;
        int daysAverage = (optionOneGr + optionTwoGr) / 2;

        System.out.println(optionOneGr + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + oneOptionGr + " гр");
        System.out.println(optionTwoGr + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + twoOptionGr + " гр");
        System.out.println(daysAverage + " дней может потребоваться  в среднем, чтобы добиться результата похудения");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int macha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int currentSalaryYaerM = macha *12;
        long increasedSalaryMonthsM = (long) (macha *1.1f);
        float increasedSalaryYersM = increasedSalaryMonthsM * 12;
        long incomeGrownM = (long) (increasedSalaryYersM - currentSalaryYaerM);

        int currentSalaryYaerD = denis *12;
        long increasedSalaryMonthsD = (long) (denis *1.1f);
        float increasedSalaryYersD = increasedSalaryMonthsD *12;
        long incomeGrownD = (long) (increasedSalaryYersD - currentSalaryYaerD);

        int currentSalaryYaerK = kristina *12;
        long increasedSalaryMonthsK = (long) (kristina *1.1f);
        float increasedSalaryYersK = increasedSalaryMonthsK *12;
        long incomeGrownK = (long) (increasedSalaryYersK - currentSalaryYaerK);

        System.out.println("Маша теперь получает " + increasedSalaryMonthsM + " рублей. Годовой доход вырос на " + incomeGrownM + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryMonthsD + " рублей. Годовой доход вырос на " + incomeGrownD + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryMonthsK + " рублей. Годовой доход вырос на " + incomeGrownK + " рублей");


    }
}