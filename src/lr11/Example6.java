package lr11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер: ");
        int numb = in.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(30);
        List<Integer> filteredNumbers = filterNumbersDivisibleBy(numbers, numb);

        for (int num : filteredNumbers) {
            System.out.println(num);

    }
}
    public static List<Integer> filterNumbersDivisibleBy(List<Integer> numbers, int numb) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % numb == 0) {
                filteredNumbers.add(num);
            }
        }

        return filteredNumbers;
    }
}