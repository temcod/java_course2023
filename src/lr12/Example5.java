package lr12;
//        Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
//        Количество потоков должно быть равно количеству ядер процессора.
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Example5 {
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

        // Запускаем потоки для поиска максимальных значений в каждой части массива
        for (int i = 0; i < numCores; i++) {
            int finalI = i;
            results[i] = executorService.submit(() -> findMax(chunks[finalI]));
        }
        // Ожидаем завершения всех потоков и получаем результаты
        int max = Integer.MIN_VALUE;
        for (Future<Integer> result : results) {
            try {
                int localMax = result.get();
                if (localMax > max) {
                    max = localMax;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // Выводим максимальное значение
        System.out.println("Максимальное значение: " + max);

        // Завершаем пул потоков
        executorService.shutdown();
    }
    private static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}

//    Первоначальный массив чисел: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//        Количество ядер процессора: 4
//        Разделение массива на части по количеству ядер процессора:
//        Часть 1: {1, 2}
//        Часть 2: {3, 4}
//        Часть 3: {5, 6}
//        Часть 4: {7, 8}
//        Часть 5: {9, 10} (последняя часть, длина меньше остальных)
//        Создание пула потоков и запуск потоков для поиска максимальных значений в каждой части массива.
//        Поток 1: максимальное значение в части 1: 2
//        Поток 2: максимальное значение в части 2: 4
//        Поток 3: максимальное значение в части 3: 6
//        Поток 4: максимальное значение в части 4: 8
//        Поток 5: максимальное значение в части 5: 10
//        Среди найденных максимальных значений в каждой части массива:
//        2, 4, 6, 8, 10
//        Максимальное значение из найденных: 8
//        Итак, результат всё равно 8, так как массив был разделен на части, и каждая часть была обработана отдельным потоком.
//        Найденные максимальные значения в каждой части были сравнены и выбрано наибольшее из них (поэтому ответ 8,
//        так как 10 было в последней части, обработанной потоком, но наибольшее из найденных максимумов было 8).


