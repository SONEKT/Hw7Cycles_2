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
        System.out.println("Задача1");
        var salary = 15_000;
        var total = 0;
        var month = 0;
        var target = 2_495_000;

        while (total < target) {
            month++;
            total = total + salary;

            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        var i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача3");
        double pops = 12_000_000;
        int growthPerThousand = 17;
        int deathPerThousand = 8;

        for (int year = 1; year <= 10; year++) {
            double thousandsPops = pops / 1000;
            double growthPerYear = thousandsPops * growthPerThousand;
            double deathPerYear = thousandsPops * deathPerThousand;

            pops += growthPerYear - deathPerYear;
            System.out.println("Год " + year + " численность населения составляет" + pops);
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        var bank = 15_000;
        var target = 12_000_000;
        var month = 0;
        var percent = 7;

        while (bank < target) {
            bank += bank / 100 * percent;
            month++;
            System.out.println("Месяц " + month + " сумма " + bank);
        }
    }

    public static void task5() {
        System.out.println("Задача5");
        var bank = 15_000;
        var target = 12_000_000;
        var month = 0;

        while (bank <= target) {
            bank += bank / 100 * 7;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + bank);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача6");
        var bank = 15_000;
        var month = 0;
        var year = 0;

        while (year < 9) {
            bank += bank / 100 * 7;
            month++;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + bank);
            }

            if (month % 12 == 0) {
                year++;
            }
        }
    }

    public static void task7() {
        System.out.println("Задача7");
        var day = 1;

        for (; day <= 31; day += 7) {

            if (day % 7 == 0) {
                System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача8");
        var year = 0;
        var comet = 79;
        var currentYear = 2023;

        while (year <= currentYear + 100) {
            year++;

            if (year <= currentYear + 100 && year >= currentYear - 200 && year % comet == 0) {
                System.out.println(year);
            }
        }
    }
}