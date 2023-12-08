package lr3;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число ");
        int a = in.nextInt();
        System.out.println("Введите второе целое число ");
        int b = in.nextInt();

        if (a > b) {

        for (int i = b; i <= a; i++) {
            System.out.printf("%d\n", i);
        }
        }
        else {
            for (int j = a; j <=b; j++){
                System.out.printf("%d\n", j);
            }
        }

        System.out.println("конец");

    }
}





