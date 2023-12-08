package lr3;
import java.util.Scanner;
public class Example3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности Фиббоначи ");
        Integer quantity = in.nextInt();

        int[] fibonacciNumbers = new int[quantity];

        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;

        int count = 2;

        while (count < quantity) {
            fibonacciNumbers[count] = fibonacciNumbers[count - 1] + fibonacciNumbers [count - 2];
            count++;
        }

        for (int i = 0; i < quantity; i++) {
            System.out.printf("%d ", fibonacciNumbers[i]);
        }

        System.out.println("\n");
        in.close();
    }
}
