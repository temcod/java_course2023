package lr6.Example10;
/*
Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов.
Результатом метод возвращает массив из двух элементов:
это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
 */
public class Main10 {
    public static int[] MaxMin;
    //методу аргументом передается произвольное количество целочисленных аргументов
    public static int[] calcMaxMin(int ... array){
        int max = array[0];
        int min = array[0];
        for (int i =0; i<array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        MaxMin= new int[]{max, min};
        //Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
        return MaxMin;
    }
    public static void viewMaxMin() {
        System.out.println("\nMaxiMin[max] = " + MaxMin[0]);
        System.out.println("MaxiMin[min] = " + MaxMin[1]);
    }
}

