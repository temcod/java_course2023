package lr9.Example7;
import java.util.LinkedList;
public class Example7LinkedList {
    public static void main(String[] args) {
        int N = 10; // Количество человек

        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size(); //человек для удаления
            people.remove(index); // Удаляем второго человека
        }

        System.out.println("Оставшийся человек: " + people.get(0));

    }
}
