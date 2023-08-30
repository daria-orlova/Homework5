import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ЗАДАЧА 1.1 - c помощью условия switch-case");
        System.out.print("Введите цифру 0, если у вас iOS, и 1, если Android: ");
        int clientOS = scan.nextInt();
        // вместо int нужно использовать boolean?
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("ЗАДАЧА 1.2 - c помощью условия if-else");
        System.out.print("Введите цифру 0, если у вас iOS, и 1, если Android: ");
        clientOS = scan.nextInt();
        // вместо int нужно использовать boolean?
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("ЗАДАЧА 2.1 - c помощью условия switch-case");
        System.out.print("Введите цифру 0, если у вас iOS, и 1, если Android: ");
        clientOS = scan.nextInt();
        System.out.print("Введите 2, если год выпуска вашего телефона раньше 2015, и 3, если 2015 года выпуска и позже: ");
        int clientDeviceYear = scan.nextInt();
        switch (clientOS) {
            case 0:
                System.out.println("Вот ссылка на скачивание приложения для iOS");
                break;
            default:
                System.out.println("Вот ссылка на скачивание приложения для Android");
        }
        switch (clientDeviceYear) {
            case 2:
                System.out.println("Лучше установите облегченную версию приложения");
                break;
            default:
                System.out.println("Необходимо установить полную версию приложения");
        }

        System.out.println("ЗАДАЧА 2.2 - c помощью условия if-else");
        System.out.print("Введите цифру 0, если у вас iOS, и 1, если Android: ");
        clientOS = scan.nextInt();
        System.out.print("Введите год выпуска вашего телефона: ");
        clientDeviceYear = scan.nextInt();
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите полную версию приложения");
            if (clientOS == 1) {
                System.out.println("Вот ссылка на приложение для Android");
            } else {
                System.out.println("Вот ссылка на приложение для iOS");
            }
        } else {
            System.out.println("Установите облегченную версию приложения");
            if (clientOS == 1) {
                System.out.println("Вот ссылка на приложение для Android");
            } else {
                System.out.println("Вот ссылка на приложение для iOS");
            }
        }
        /*
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите полную версию приложения");
        } else {
            System.out.println("Установите облегченную версию приложения");
        }
        if (clientOS == 1) {
            System.out.println("Вот ссылка на приложение для Android");
        } else {
            System.out.println("Вот ссылка на приложение для iOS");
        }
        */

        System.out.println("ЗАДАЧА 3");
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println (year + " год является високосным");
        } else {
            System.out.println (year + " год не является високосным");
        }

        System.out.println("ЗАДАЧА 4");
        System.out.print("Введите расстояние от офиса до адреса доставки (в км): ");
        int deliveryDistance = scan.nextInt();
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (deliveryDistance <= 60) {
            System.out.println("Доставка займет двое суток");
        } else if (deliveryDistance <= 100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Доставка не осуществляется");
        }

        System.out.println("ЗАДАЧА 5");
        System.out.print("Введите номер месяца в году: ");
        int monthNumber = scan.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
