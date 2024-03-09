package lr9.chapter5;
import java.util.TreeMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime, endTime;

        // TreeMap
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            treeMap.put(i, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("TreeMap - добавление элементов: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        treeMap.remove(5000);
        endTime = System.currentTimeMillis();
        System.out.println("TreeMap - удаление элемента: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        treeMap.get(3000);
        endTime = System.currentTimeMillis();
        System.out.println("TreeMap - получение элемента: " + (endTime - startTime) + " ms");

        // ArrayDeque
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayDeque.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayDeque - добавление элементов: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayDeque.remove(5000);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayDeque - удаление элемента: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayDeque.peek();
        endTime = System.currentTimeMillis();
        System.out.println("ArrayDeque - получение элемента: " + (endTime - startTime) + " ms");

        // ArrayList
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - добавление элементов: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayList.remove(5000);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - удаление элемента: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayList.get(3000);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - получение элемента: " + (endTime - startTime) + " ms");

    }
}
