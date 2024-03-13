package lr11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите максимальное значение: ");
        int maxValue = in.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(100);

        List<Integer> filteredNumbers = filterNumbersLessThanValue(numbers, maxValue);

        for (int num : filteredNumbers) {
            System.out.println(num);
    }
}
    public static List<Integer> filterNumbersLessThanValue(List<Integer> numbers, int maxValue) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num < maxValue) {
                filteredNumbers.add(num);
            }
        }
        return filteredNumbers;
    }
}
