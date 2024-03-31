package lr13.part1;

public class Example8 {
    public static int m(){
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) { // Добавляем обработку исключения RuntimeException
            System.out.println("Обработка исключения");
        } finally {
            System.out.println("1");
        }
        return 0; // Добавляем возвращаемое значение, чтобы метод имел тип int
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
