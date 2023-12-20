package lr6.Example7;
/*
Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента.
 */
public class Main7 {
    static int[] IntArray;
    //статический методом, аргументом которому передастся символьный массив
    public static int[] convertCharArray(char ChArray[]) {
        IntArray = new int[ChArray.length];
        for (int i = 0; i < ChArray.length; i++) {
            IntArray[i] = (int)ChArray[i];
        }
        //результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента
        return IntArray;
    }
    public static void viewArray() {
        for (int i = 0; i < IntArray.length; i++) {
            System.out.println("IntArray[" + i + "] = " + IntArray[i]);
        }
    }
}

