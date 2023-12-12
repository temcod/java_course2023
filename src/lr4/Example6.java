package lr4;
import java.util.*;
public class Example6 {
    public static void main(String[] args) {
        int[][]array = new int[3][5];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        int row = random.nextInt(3);
        int column = random.nextInt(5);
        System.out.println("Удаление строки и столбца " +row+ " " + column);
        int[][] array2 = new int[3-1][5-1];
        for (int i = 0; i < 3-1; i++) {
            for (int j = 0; j < 5-1; j++) {
                array2[i][j] = array[i][j];
            }
        }
        System.out.println("Новый массив после удаления: ");
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = 0; j < 5 -1; j++){
                System.out.print(array2[i][j]);
            } System.out.println();
        }
        }
    }

