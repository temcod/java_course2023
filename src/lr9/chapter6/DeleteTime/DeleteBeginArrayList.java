package lr9.chapter6.DeleteTime;
import java.util.ArrayList;

public class DeleteBeginArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

// Заполнение списка элементами
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1); // Удаление элемента
        long endTime = System.nanoTime();

        System.out.println("Время выполнения операции удаления элемента на начало из arrayList: " + (endTime - startTime) + " наносекунд");
    }
}
