package lr3;
import java.util.Scanner;
import java.util.Random;
public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int Size = id.nextInt();

        System.out.println("Размер массива: " + Size);

        int[] nums = new int[Size];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(99);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        int[] min_count = new int[Size];
        int[] min_nums = new int[Size];
        int min = nums [0];

        for (int l = 0; l < 2; l++) {
            for (int j = 0; j < nums.length; j++) {
                if (min >= nums[j]) {
                    min_count[j] = j;
                    min = nums[j];
                    min_nums[j] = nums[j];
                } else {
                    min_count[j] = 0;
                    min_nums[j] = 0;
                }
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (min_nums[k] == min && min_count[k] != 0) {
                System.out.println("Элемент массива [" + min_count[k] + "]" + min_nums[k] + "- минимальное значение");
            }
        }
    }
}