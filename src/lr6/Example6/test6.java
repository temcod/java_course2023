package lr6.Example6;

public class test6 {
    public static void main(String[] args) {
        int[] inArray = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println("Второй аргумент метода меньше длины массива");
        Main6 myexample = new Main6();
        for (int i = 0; i < myexample.SetArray(inArray, 10).length; i++) {
            System.out.println("outArray[" + i + "] = " + myexample.SetArray(inArray, 10)[i]);
        }
        System.out.println("Второй аргумент метода больше длины массива");
        Main6.SetArray(inArray, 25);
        Main6.viewArray();
    }
}
