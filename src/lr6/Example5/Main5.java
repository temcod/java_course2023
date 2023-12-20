package lr6.Example5;
/*
Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел 12 + 22 + 32 + ... + п2.
Число п передается аргументом методу.
Предложите версию метода с рекурсией и без рекурсии. Д
ля проверки результата можно использовать формулу 12 + 22 +32+…+n2=(n+l) (2n + 1)/6
 */
public class Main5 {
        public static int SquareSum1(int n) {
            // рекурсивный метод
            int result =0;
            System.out.println("*" + n);
            if (n <= 1) return 1;//проверка входного параметра, если павен 1, то выход из метода
            result += SquareSum1(n-1)+n*n;
            return result;
        }
        public static int SquareSum2(int n){
            // метод без рекурсии

            int result=0;
            int j = n;
            int s = 2;
            for(int i=n; i>0;i--){
                System.out.println("*" + j);
                result = (int)Math.pow(j,s) + result;
                j--;
            }
            return result;
        }
    }


