package lr4;
import java.util.*;
public class Example7 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;
        int[][] array = new int[rows][columns];

        for(int n = 0; n < rows*columns; n++) {
            int i = n / columns;
            int j = i % 2 == 0 ? n % columns : columns - 1 - n % columns;
            array[i][j] = n;
        }
        System.out.println(Arrays.deepToString(array));

    }

}
