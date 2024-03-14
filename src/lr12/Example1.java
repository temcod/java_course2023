package lr12;
// Напишите программу, которая запускает два потока и выводит на экран их имена и текущее время в течение 10 секунд.
import java.time.LocalTime;
public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        //создание потока P1
        Thread P1 = new Thread(()->{
            //создаем цикл, который выводит текущее время и имя потока 10 раз
            for(int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //создание потока P2 и цикла
        Thread P2 = new Thread(()->{
            for(int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        P1.start();
        P2.start();

        P1.join();
        P2.join();
    }

}
