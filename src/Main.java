public class Main {
    public static void main(String[] args) {

        int clientOS = 1;

        if (clientOS == 0) {

            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {

            System.out.println("Нет возможности идентифицировать операционную систему");
        }

        int clientDeviceYear = 2010;
        int clientOS2 = 1;

        if (clientOS2 == 0) {

            if (clientDeviceYear >= 2015) {

                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }


        } else if (clientOS2 == 1) {

            if (clientDeviceYear < 2015) {

                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {

                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        int year = 2021;

        if ((year > 1584) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {

            System.out.println(year + " год является високосным");
        } else {

            System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {

            System.out.println("Потребуется дней: 1");
        }

        if (deliveryDistance > 20 && deliveryDistance <= 60) {

            System.out.println("Потребуется дней: 2");
        }

        if (deliveryDistance > 60 && deliveryDistance <= 100) {

            System.out.println("Потребуется дней: 3");
        }

        if (deliveryDistance > 100) {

            System.out.println("Нет доставки");
        }

        int monthNumber = 12;

        switch (monthNumber) {

            case 1:
                System.out.println("Зимний сезон");
                break;

            case 2:
                System.out.println("Зимний сезон");
                break;

            case 3:
                System.out.println("Весенний сезон");
                break;

            case 4:
                System.out.println("Весенний сезон");
                break;

            case 5:
                System.out.println("Весенний сезон");
                break;

            case 6:
                System.out.println("Летний сезон");
                break;

            case 7:
                System.out.println("Летний сезон");
                break;

            case 8:
                System.out.println("Летний сезон");
                break;

            case 9:
                System.out.println("Осенний сезон");
                break;

            case 10:
                System.out.println("Осенний сезон");
                break;

            case 11:
                System.out.println("Осенний сезон");
                break;

            case 12:
                System.out.println("Зимний сезон");
                break;

            default:
                System.out.println("Невозможно определить сезон");


        }

    }


}
