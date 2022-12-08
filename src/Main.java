import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();

        task3();
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

        int year = 2008;
        int bisYear = year % 4;
        int bisYear100 = year % 100;
        int bisYear400 = year % 400;

        if (bisYear == 0) {
            if (){

            }
        }


    }
}