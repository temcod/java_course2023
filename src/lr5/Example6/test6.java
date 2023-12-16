package lr5.Example6;


public class test6 {
    public static void main(String[] args) {
        //конструктор с 2-я аргументами
        Main6 myexample = new Main6(10,20);
        myexample.PrintInt();
        //конструктор с 1-м аргументом
        myexample = new Main6(1);
        myexample.PrintInt();
        //метод с 2-я аргументами
        myexample.SetInt(10,15);
        myexample.PrintInt();
        //метод с 1-м аргументом
        myexample.SetInt(-10);
        myexample.PrintInt();
    }
}
