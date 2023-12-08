package lr3;
import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {

        char[] array = {'a', 'c', 'e', 'g', 'i', 'k', 'm', 'o', 'q', 's'};

        for ( int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

        }
        System.out.println();

        for (int j = array.length - 1; j >= 0; j--){
            System.out.print(array[j]);
        }

    }
}









