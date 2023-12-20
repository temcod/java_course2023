package lr6.Example5;

public class test5 {
    public static void main(String[] args) {
        int n = 6;
        int sq0 = (n*(n+1)*(2*n+1)/6);
        boolean test;
        System.out.println("Рекурсивный метод");
        int sq1 = Main5.SquareSum1(n);
        test = sq1 == sq0;
        System.out.println("Вычисление cуммы квадратов числа "+"\""+n+"\""+" = "+sq1+" ("+test+")");
        System.out.println("\nМетод без рекурсии");
        int sq2 = Main5.SquareSum2(n);
        test = sq2 == sq0;
        System.out.println("Вычисление cуммы квадратов числа "+"\""+n+"\""+" = "+sq2+" ("+test+")");
    }
}
