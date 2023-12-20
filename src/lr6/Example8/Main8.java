package lr6.Example8;
/*
Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве).
 */
import java.util.Random;
public class Main8 {
    public static double ArrayAvg (int Array[]){
        int sum=0;
        for (int i = 0 ; i <Array.length; i++){
            sum += Array[i];
        }
        double result = (double)sum/Array.length;
        return result;
    }
}


