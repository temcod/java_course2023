package lr1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        Integer number = in.nextInt();

        System.out.printf("%d %d %d %d\n", number - 1, number, number + 1, (((number - 1) + (number) + (number + 1)) * ((number - 1) + (number) + (number + 1))));

        in.close();
    }
}
