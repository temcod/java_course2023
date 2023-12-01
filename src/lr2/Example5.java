package lr2;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        Integer number = in.nextInt();

        if (String.valueOf(number).length() < 4) {
            System.out.println("В вашем числе тысяч 0");
        } else {
            System.out.printf("В вашем числе тысяч: %d\n", number / 1000 % 10);
        }
        in.close();
    }
}
