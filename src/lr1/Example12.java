package lr1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите Ваш возраст: ");
        Integer age = in.nextInt();

        System.out.printf("Год Вашего рождения: %d\n", 2023 - age);

        in.close();
    }
}
