import java.time.LocalDate;

public class Main {
    //Задание 1
    public static void countYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
//задание 2
    public static void getClientOs(int i, int os) {
        if (i >= 2015 && os == 0) {
            System.out.print("Скачайте обычную версию для IOS");
        } else if (i >= 2015 && os == 1) {
            System.out.print("Скачайте обычную версию для Android");
        } else if (i < 2015 && os == 0) {
            System.out.println("Скачайте lite версию для IOS ");
        } else {
            System.out.println("Скачайте lite версию для Android ");

        }

    }
    //Задание 3
    public static void deliveryCard (int deliveryDistance ) {
        int deliveryDays = 1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется " + deliveryDays + " день");
        } else if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 80) {
            deliveryDays++;
            System.out.println("Потребуется " + deliveryDays + " дня");
        }
    }
    public static void main(String[] args) {
        int year = 400;
        countYear(year);
        int i = 2012; //LocalDate.now().getYear();
        int os = 1;
        getClientOs(i, os);
        int distance = 60;
        deliveryCard(distance);


    }
}