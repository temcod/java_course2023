package lr9.Example2;
import java.util.*;
import java.math.*;
/*
Создать приложение с использованием рекурсии для перевода целого числа, введенного с клавиатуры,
в двоичную систему счисления.
 */
public class Main {
    private static void Binary(int n){
        if(n > 0){
            Binary(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число ");
        int num = in.nextInt();
        System.out.println("введенное число в двоичной системе счисления: ");
        Binary(num);
    }
}



