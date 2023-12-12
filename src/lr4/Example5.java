package lr4;
import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        int[][]array = new int[2][4];
        Random random  = new Random(9);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(9);{
                System.out.print(+ array[i][j]);
                }
            } System.out.println();

        } int[][]array2 = new int[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                array2[i][j] = array[j][i];
                System.out.print(+ array2[i][j]);
            } System.out.println();
        }

    }
}
