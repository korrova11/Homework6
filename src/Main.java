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
        task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 16; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);

        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным. ");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        for (int i = 1; i <= 12; i++) {
            int salary = i * 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + salary + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        double salary = 29000;
        double totalSalaryWithPenny = 0;
        for (int i = 1; i <= 12; i++) {
            totalSalaryWithPenny = salary + (i-1)*salary / 100;
            salary = totalSalaryWithPenny;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + salary + " рублей.");
        }


    }
}





