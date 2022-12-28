public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2020;
        checkYear(year);
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является высокосным");
        } else {
            System.out.println(year + " не является высокостным");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        infoOS(1,2013);
    }

    static  void infoOS(int clientOs, int clientDeviceYear) {
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по сылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по сылке");
            }
        }


    }
    public static void task3() {
        System.out.println("Задача 3");
        days(95,1);
    }
        static  void days(int deliveryDistance, int deliveryDays) {

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

    }
}

