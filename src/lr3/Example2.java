package lr3;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String weekday = in.nextLine();

        switch (weekday) {
            case ("понедельник"):
                System.out.println("Порядковый номер этого дня: 1");break;
            case ("вторник"):
                System.out.println("Порядковый номер этого дня: 2");break;
            case ("среда"):
                System.out.println("Порядковый номер этого дня: 3");break;
            case ("четверг"):
                System.out.println("Порядковый номер этого дня: 4");break;
            case ("пятница"):
                System.out.println("Порядковый номер этого дня: 5");break;
            case ("суббота"):
                System.out.println("Порядковый номер этого дня: 6");break;
            case ("воскресенье"):
                System.out.println("Порядковый номер этого дня: 7");break;
            default:
                System.out.println("Такого дня нет ");break;
        }
    } 
}
