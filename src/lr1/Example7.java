package lr1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String firstName = in.nextLine();

        System.out.print("Введите возраст: ");
        Integer age = in.nextInt();

        System.out.printf("Вас зовут %s и ваш возраст %d\n", firstName, age);

        in.close();


    }
}
