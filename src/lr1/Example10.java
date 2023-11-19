package lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите Ваш год рождения: ");
        Integer age = in.nextInt();

        System.out.printf("Ваш возраст: %d\n", 2023 - age);

        in.close();
    }
}
