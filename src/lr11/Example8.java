package lr11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Введите минимальное значение: ");
        int minValue = in.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        List<Integer> filteredNumbers = filterNumbersByValue(numbers, minValue);

        for (int num : filteredNumbers) {
            System.out.println(num);
    }
}
    public static List<Integer> filterNumbersByValue(List<Integer> numbers, int minValue) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num > minValue) {
                filteredNumbers.add(num);
            }
        }
        return filteredNumbers;
    }
}
