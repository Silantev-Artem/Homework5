public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int clientOS = 1;
        if (clientOS == 0)  {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\nЗадание 2");
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else if (clientDeviceYear >= 2015) {
            if (clientOS == 0)  {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else  {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("\nЗадание 3");

        int year = 2025;

        if (year >= 1584){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            }else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год до разделения на високосный и невисокосный");
            }


        System.out.println("\nЗадание 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;

        if (deliveryDistance <20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance <60) {
            deliveryDay = deliveryDay +1;
            System.out.println("Потребуется дней: " + deliveryDay);
        }else if (deliveryDistance >= 60 && deliveryDistance <100){
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }else if (deliveryDistance > 100) {
            System.out.println("Нет доставки на такое расстояние");
        }

        System.out.println("\nЗадание 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер месяца больше 12");
        }


    }

    }
