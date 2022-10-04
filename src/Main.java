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

    private static void task9() {
        /*Перепишите решение задачи выше при условии, что деньги вы
        откладывать будете не "в банку", а в банк под проценты – 12% годовых.
         Выведите сумму накоплений за каждый месяц в консоль в формате
         "Месяц … , сумма накоплений равна … рублей" .*/
        System.out.println("Задание 3-2");
        int contribution = 29_000;
        int amount = 0;
        int percentagePerYear = 12;
        int percentPerMounth = percentagePerYear/12;
        for (int i = 1 ; i <13 ; i++ ) {
            amount = amount + amount/100;
            amount = amount +contribution;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей" , i , amount);
            System.out.println();
        }
        System.out.println();
    }

    private static void task8() {
        /*Посчитайте с помощью цикла for сумму годовых накоплений,
        если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
        Выведите сумму накоплений за каждый месяц в консоль в формате
        "Месяц … , сумма накоплений равна … рублей" .*/
        System.out.println("Задание 3-1");
        int contribution = 29_000;
        int amount = 0;
        for (int i = 1 ; i <13 ; i++ ) {
            amount = amount +contribution;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей" , i , amount);
            System.out.println();
        }
        System.out.println();
    }

    private static void task7() {
        /*  Напишите программу, которая выводит в консоль последовательность
         цифр:  1 2 4 8 16 32 64 128 256 512 */
        System.out.println("Задание 2-3");
        for (int i = 1 ; i <= 512 ; i = i * 2) {
            System.out.print(" " + i );
        }
        System.out.println();
    }

    private static void task6() {
        /* Напишите программу, которая выводит в консоль последовательность
         цифр: 7 14 21 28 35 42 49 56 63 70 77 84 91 98 */
        System.out.println("Задание 2-2");
        for (int i = 7 ; i <= 98 ; i = i + 7) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    private static void task5() {
        /*Напишите программу, которая выводит в консоль все високосные года,
         начиная с 1904 года до 2096. В консоль результат
         должен выводиться в формате "… год является високосным".*/
        System.out.println("Задание 2-1");
        for (int i = 1904 ; i <= 2096 ; i = i+4) {
            System.out.printf("%d год является високосным", i );
            System.out.println();
        }
        System.out.println();
    }

    private static void task4() {
        /*Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.*/
        System.out.println("Задание 1-4");
        for (int i = 10 ; i != -11 ; i--){
            System.out.println(i);
        }
        System.out.println();
    }

    private static void task3() {
        /* Выведите в консоль все четные числа от 0 до 17. */
        System.out.println("Задание 1-3");
        for ( int i = 0 ; i <= 17 ; i ++) {
            if (i % 2 == 0 && i > 0) {
                System.out.printf( " Число %d четное ", i);
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void task2() {
       /* С помощью цикла for выведите в консоль все числа от 10 до 1. */
        System.out.println("Задание 1-2");
        for (int i = 10 ; i != 0 ; i--) {
            System.out.println("Число " + i);
        }
        System.out.println();
    }

    private static void task1() {
    /* С помощью цикла for выведите в консоль все числа от 1 до 10. */
        System.out.println("Задание 1-1");
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println("Число " + i);
        }
        System.out.println();
    }
}