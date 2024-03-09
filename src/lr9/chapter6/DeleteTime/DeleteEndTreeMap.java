package lr9.chapter6.DeleteTime;
import java.util.TreeMap;
public class DeleteEndTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i < 500000; i++) {
            treeMap.put(i, "Element" + i);
        }

        long startTime = System.nanoTime();
        treeMap.remove(treeMap.lastKey());
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время затраченное на удаление элемента из конца TreeMap: " + duration + " наносекунд");
    }
}
