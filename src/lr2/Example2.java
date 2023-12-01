package lr2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        Integer number = in.nextInt();

        if (number % 5 == 2) {
            System.out.println("Число при делении на 5 дает остаток 2");
        } if (number % 7 == 1) {
            System.out.println("Число при делении на 7 дает остаток 1");
        } else {
            System.out.println("Число не удовлетворяет критериям");
        }
        in.close();

    }
}
