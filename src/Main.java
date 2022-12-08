import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");

        byte OS = 1;

        if (OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Укажите, какая операционная система на вашем утройстве: введите 0 - если iOS, 1 - если Android");
        int clientOS = scanner.nextInt();

        if (clientOS == 0) {
            System.out.println("Введите год выпуска вашего устройства");
            int clientDeviceYear = scanner.nextInt();
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            System.out.println("Введите год выпуска вашего устройства");
            int clientDeviceYear = scanner.nextInt();
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Введите корректные данные для продолжения");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int year = 2400;
        int bisYear = year % 4;
        int bisYear100 = year % 100;
        int bisYear400 = year % 400;

        if (bisYear == 0) {
            if (bisYear100 == 0 && bisYear400 != 0) {
                System.out.println(year + " год не является високосным.");
            } else {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 95;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потербуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставка не осуществляется.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int month = 1;

        switch (month) {
            case (1):
            case (2):
            case (12):
                System.out.println(month + " месяц принадлежит к сезону зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println(month + " месяц принадлежит к сезону весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println(month + " месяц принадлежит к сезону лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println(month + " месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("В году всего 12 месяцев");


        }
    }
}