package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String month = in.nextLine();

        System.out.print("Введите количество дней в указанном месяце: ");
        Integer quantity = in.nextInt();

        System.out.printf("Количество дней в месяце %s равно %d\n", month, quantity);

        in.close();
    }
}
