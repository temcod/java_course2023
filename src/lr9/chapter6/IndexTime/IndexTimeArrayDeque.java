package lr9.chapter6.IndexTime;

public class IndexTimeArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<String> arrayDeque = new java.util.ArrayDeque<>();

        // Заполнение ArrayDeque
        for (int i = 0; i < 1000000; i++) {
            arrayDeque.add("Value" + i);
        }

        // Индекс элемента, который мы будем получать
        int index = 500000;

        // Замер времени выполнения операции получения элемента по индексу
        long startTime = System.nanoTime();
        String value = arrayDeque.getLast();
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время затраченное на получение элемента по индексу в ArrayDeque: " + duration + " наносекунд");
    }
}
