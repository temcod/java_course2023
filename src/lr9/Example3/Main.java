package lr9.Example3;
/*Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.*/
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите размер одномерного массива: ");
        int Size = in.nextInt();
        System.out.println("размер массива равен: ");
        MyArray RA1 = new MyArray(Size);

    }
}
