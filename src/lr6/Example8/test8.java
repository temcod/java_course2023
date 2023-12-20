package lr6.Example8;

import java.util.Random;
public class test8 {
    public static void main(String[] args) {
        Random random = new Random(99);
        int ArrayLength = 11;
        int intArray[] = new int[ArrayLength];
        for (int i = 0; i < ArrayLength; i++) {
            intArray[i] = random.nextInt(99);
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }
        System.out.println("Среднее значение intArray["+ArrayLength+"] = "+Main8.ArrayAvg(intArray));
    }
}