package lr3;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название дня недели ");
        String weekday = in.nextLine();

        if (weekday.equals ("понедельник")) {
            System.out.println("порядковый номер дня недели 1");
        } else if (weekday.equals("вторник")) {
            System.out.println("порядковый номер дня недели 2");
        } else if (weekday.equals("среда")) {
            System.out.println("порядковый номер дня недели 3");
        } else if (weekday.equals("четверг")) {
            System.out.println("порядковый номер дня недели 4");
        } else if (weekday.equals("пятница")) {
            System.out.println("порядковый номер дня недели 5");
        } else if (weekday.equals("суббота")) {
            System.out.println("порядковый номер дня недели 6");
        } else if (weekday.equals("воскресенье")) {
            System.out.println("порядковый номер дня недели 7");
        }
        else {
            System.out.println("такого дня недели нет");
        }

    }
}
