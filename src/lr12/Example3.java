package lr12;
import org.apache.poi.ss.formula.functions.T;
public class Example3 {
    private static final Object lock = new Object();

    private static int number = 1;

    public static void main(String[] args) {
        // Создание четного потока
        Thread evenThread = new Thread(() -> {
            // Синхронизация по объекту lock
            synchronized (lock) {
                // Цикл выполнения, пока число меньше 10
                while (number < 10) {
                    // Проверка на четность числа, вывод четного числа и увеличение числа на 1
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        // Создание нечетного потока
        Thread oddThread = new Thread(() -> {
            // Синхронизация по объекту lock
            synchronized (lock) {
                // Цикл выполнения, пока число меньше 10
                while (number < 10) {
                    // Проверка на нечетность числа, вывод четного числа и увеличение числа на 1
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    }
                    // В противном случае поток ждет уведомления и освобождает блокировку
                    else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        // Установка имени для четного и нечетного потока
        evenThread.setName("Even Thread");
        oddThread.setName("Odd Thread");
        // Запуск потоков выполнения
        evenThread.start();
        oddThread.start();
    }
}


