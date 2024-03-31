package lr13.part1;

public class Example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo >= 0.001) { // Условие изменено на >=, чтобы исправить ошибку
            throw new IllegalArgumentException("Неверное число");
        } else {
            System.out.println("Код работает правильно");
        }
    }
    public static void main(String[] args) {
        m("строка", 0.000001); // В main переданы корректные аргументы
    }
}
