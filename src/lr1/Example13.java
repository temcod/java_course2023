package lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        Integer firstnumber = in.nextInt();

        System.out.print("Введите второе число: ");
        Integer secondnumber = in.nextInt();

        System.out.printf("Сумма этих чисел равна: %d\n", firstnumber + secondnumber);

        in.close();

    }
}
