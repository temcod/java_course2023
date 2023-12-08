package lr3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
public class Example10 {
    public static void main(String[] args) {

        Integer[] A = new Integer[5];
        Random random = new Random();

        for (int i = 0; i < A.length; i++){
            A[i] = random.nextInt(99);

            System.out.println("Элемент массива: " +A[i]);

        }
        Arrays.sort(A, Collections.reverseOrder());
        for (int result : A) {
            System.out.println("Сортировка массива: " + result);
        }

    }
}


