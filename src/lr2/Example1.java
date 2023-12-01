package lr2;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer number = in.nextInt();

        if (number % 3 == 0) {
            System.out.println("Число делится на три");

        } else {
            System.out.println("Число не делится на три");
        }
    }
}
