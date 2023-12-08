package lr3;
import java.util.Scanner;
public class Example4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число ");
        int a = in.nextInt();
        System.out.println("Введите второе целое число ");
        int b = in.nextInt();

        if (a > b) {
            while (b <= a) {
                System.out.println(b);
                b++;
            }
        }
        else if (b > a) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }

        }
        System.out.println("конец");
    }
}
