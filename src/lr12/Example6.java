package lr12;
//        Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
//        Количество потоков должно быть равно количеству ядер
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Example6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Получаем количество ядер процессора
        int numCores = Runtime.getRuntime().availableProcessors();

        // Создаем пул потоков с количеством потоков, равным количеству ядер процессора
        ExecutorService executorService = Executors.newFixedThreadPool(numCores);

        // Разбиваем массив на части по количеству ядер процессора
        int chunkSize = numbers.length / numCores;
        int[][] chunks = new int[numCores][];
        for (int i = 0; i < numCores; i++) {
            chunks[i] = Arrays.copyOfRange(numbers, i * chunkSize, (i + 1) * chunkSize);
        }

        // Создаем массив для хранения результатов вычислений потоков
        Future<Integer>[] results = new Future[numCores];

        // Запускаем потоки для суммирования элементов в каждой части массива
        for (int i = 0; i < numCores; i++) {
            int finalI = i;
            results[i] = executorService.submit(() -> sum(chunks[finalI]));
        }

        // Ожидаем завершения всех потоков и получаем результаты
        int sum = 0;
        for (Future<Integer> result : results) {
            try {
                sum += result.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Выводим сумму элементов массива
        System.out.println("Сумма элементов массива: " + sum);

        // Завершаем пул потоков
        executorService.shutdown();
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}


