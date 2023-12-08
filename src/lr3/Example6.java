package lr3;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива");
        if (in.hasNextInt()) {
            int Size = in.nextInt();
            if (Size > 0) {
                System.out.println("Размер массива равен: "+ Size);
                int[] nums = new int[Size];
                int a = 0;
                int b = 0;
                while (a < Size) {
                    b++;
                    if (b % 5 == 2) {
                        nums[a] = b;
                        System.out.println("Элемент массива ["+ a +"] = " + nums[a]);
                        a++;
                    }
                }
                System.out.println("Конец");
            }
            else {
                System.out.println("Введено некорректное значение");
                in.next();
            }
        }
        else {
            System.out.println("Введено некорректное значение");
            in.next();
        }
    }
}




