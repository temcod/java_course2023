package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите год Вашего рождения: ");
        Integer age = in.nextInt();

        System.out.printf("Ваше имя: %s\n", name);
        System.out.printf("Ваш возраст: %d\n", 2023 - age);

        in.close();
    }
}
