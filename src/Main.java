public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        switch (clientOS){
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Такой ОС нет!");
        }//Задание 1

        int clientOS1 = 1;
        int clientDeviceYear = 2013;
        if (clientOS1==1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");}
        else if (clientOS1==1 && clientDeviceYear<=2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        if (clientOS1==0 && clientDeviceYear>=2015){
                System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS1==0 && clientDeviceYear<=2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        if (clientOS1 != 1 && clientOS1 != 0) {
            System.out.println("Такой ОС нет!");
        }//Задание 2

        int year = 2024;
        if (year%4==0 && year%100!=0){
            System.out.println(year+" год является високосным");
        }else if (year%400==0){
            System.out.println(year+" год не является високосным");
        }else {
            System.out.println(year+" год не является високосным");
        }//Задание 3

        int deliveryDistance=50;
        if (deliveryDistance<=20){
            System.out.println("Потребуется 1 день для доставки ");
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Потребуется 2 дня для доставки");
        } else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("Потребуется 3 дня доставки");
        }else {
            System.out.println("Доставка не работает!");
        }//Задание 4

        int monthNumber = 1;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
            default:
                System.out.println("Такого месяца нет!");
        }//Задание 5
    }
}
