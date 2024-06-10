public class Main {
    public static void main(String[] args) {

        int clientOS = 1;

        if (clientOS == 0) {

            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        else {

            System.out.println("Нет возможности идентифицировать операционную систему");
        }

        int clientDeviceYear = 2010;
        int clientOS2 = 1;

        if (clientOS2 == 0) {

            if (clientDeviceYear >= 2015) {

                System.out.println("Установите версию приложения для iOS по ссылке");
            }

            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }


        }
        else if (clientOS2 == 1) {

            if (clientDeviceYear < 2015) {

                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

            else {

                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }



    }



}
