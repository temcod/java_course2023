package lr3;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в сумме ");
        int a = in.nextInt();
        int S = 0;

        for (int i = 0; a > 0; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                S = S + i;
                a--;
            }
        }
        System.out.println("Сумма чисел равна: " + S);
    }
}
