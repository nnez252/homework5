public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1 ");
        var clientDeviceYear = 2010;
        var clientOs = 0;
        if (clientOs == 0 && clientDeviceYear >=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите упращенную версию приложения для IOS по ссылке");
        } if ( clientOs == 1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear<2015) {
            System.out.println("Установите упращенную версию приложения для iOS по ссылке");
        }
        // Задание 3
        System.out.println("Задание 3 ");

        var year = 2021;
                if (year%4 > 0 || year%100 > 0 || year%400 > 0){
                    System.out.println("Высокосный");
                }else {
                    System.out.println(" Обычыный");
                }
// Задание 4
        System.out.println("Задание 4 ");
        var deliveryDistance = 105;
        if ( deliveryDistance <= 20 ){
            System.out.println("Доставка занимает сутки");
        } else if (deliveryDistance>20 && deliveryDistance<60 ) {
            System.out.println("Доставка занимает 2 сутки ");
        } else if (deliveryDistance>60 && deliveryDistance<100) {
            System.out.println("Доставка занимает 3 сутки");

        }else {
            System.out.println("Уточните у продовца ");
        }
// Задание 5
        System.out.println("Задание 4 ");
        var monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
                case 8:
                    System.out.println("Сезон лето");
                    break;
            case 9:
            case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            case 12 :
                System.out.println("Сезон зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }




    }
}