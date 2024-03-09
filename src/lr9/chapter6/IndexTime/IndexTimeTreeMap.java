package lr9.chapter6.IndexTime;

public class IndexTimeTreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<Integer, String> treeMap = new java.util.TreeMap<>();

        // Заполнение TreeMap
        for (int i = 0; i < 1000000; i++) {
            treeMap.put(i, "Value" + i);
        }

        // Индекс элемента, который мы будем получать
        int index = 500000;

        // Замер времени выполнения операции получения элемента по индексу
        long startTime = System.nanoTime();
        String value = treeMap.get(index);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время затраченное на получение элемента по индексу в TreeMap: " + duration + " наносекунд");
    }
}
