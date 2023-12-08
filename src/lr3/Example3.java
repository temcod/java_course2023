package lr3;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности Фиббоначи ");
        Integer quantity = in.nextInt();

        int[] fibonacciNumbers = new int[quantity];

        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < quantity; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
        }
        for (int i = 0; i < quantity; i++) {
            System.out.printf("%d ", fibonacciNumbers[i]);
        }
        }
    }


