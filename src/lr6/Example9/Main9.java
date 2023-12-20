package lr6.Example9;
/*Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последним, второй — с предпоследним и так далее. */
public class Main9 {
    public static char[] reverseCharArray;

    //статический методом, аргументом которому передастся символьный массив
    public static char[] RCharArray(char ChArray[]) {
        char changeChar;
        int l = ChArray.length-1;
        reverseCharArray = new char[ChArray.length];
        for (int i = 0; i < ChArray.length; i++) {
            changeChar = ChArray[i];
            reverseCharArray[i] = ChArray[l-i];
            reverseCharArray[l-i] = changeChar;
        }
        //результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента
        return reverseCharArray;
    }

    public static void viewReverseChArray() {
        for (int i = 0; i < reverseCharArray.length; i++) {
            System.out.println("reverseCharArray[" + i + "] = " + reverseCharArray[i]);
        }
    }
}


