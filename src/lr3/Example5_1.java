package lr3;
import java.util.Random;
import java.util.Scanner;
public class Example5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в сумме ");
        int a = in.nextInt();
        int S = 0;

        Random random = new Random();

        while ( a > 0) {
            Integer numbers = random.nextInt(9);
            if (numbers % 5 == 2 || numbers % 3 == 1){
                System.out.println (numbers);
                S = S + numbers;
                a--;

            }
        }
        System.out.println("Сумма чисел равна: " + S);

    }
}
