package lr2;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        Integer number = in.nextInt();

        if(number >= 5 & number <= 10) {
            System.out.println("Число попадает в диапазон от 5 до 10");
        } else {
            System.out.println("Число не попадает в диапазон от 5 до 10");
        }
        in.close();
    }
}
