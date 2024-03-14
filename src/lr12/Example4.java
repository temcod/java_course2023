package lr12;
// Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.
public class Example4 {
    public static void main(String[] args) {
        //создвние 10 потоков
        for(int i = 0; i <=10; i++){
            //создание нового потока, передача в констурктор номера потока
            Thread thread = new Thread(new MyThread(i));
            //запуск потока
            thread.start();
        }
    }
    static class MyThread implements Runnable{
        private int number;
        //конструктор класса MyThread
        public MyThread(int number){
            this.number = number;
        }
        //метод run, который будет выполнен при запуске потока
        //выводим номер потока на экран

        @Override
        public void run() {
            System.out.println("Номер потока: " + number);
        }
    }
}
