package Timus.timus1001;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] roots = new double[256 * 1000];
        int k = 0;

        while (scanner.hasNextLong()) {
            roots[k++] = sqrt(scanner.nextLong());
        }
        for (int i = k - 1; i >= 0; i--) {
            System.out.printf("%.4f\n", roots[i]);
        }

    }

}
