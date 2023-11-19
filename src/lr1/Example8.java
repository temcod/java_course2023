package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String weekday = in.nextLine();

        System.out.print("Введите название месяца: ");
        String month = in.nextLine();

        System.out.print("Введите дату: ");
        Integer number = in.nextInt();

        System.out.printf("Название дня недели, Название месяца, Дата: %s %s %d\n", weekday, month, number);

        in.close();

    }

}
