package lr5.Example5;

public class test5 {
    public static void main(String[] args) {
        //присвоение значения полю через конструктор
        Main5 myexample = new Main5(10);
        System.out.println("Число = "+myexample.PrintInt());

        //присвоение значения полю через метод с аргументом
        myexample.Set(20);
        System.out.println("Число = "+myexample.PrintInt());

        //присвоение значения больше 100 полю через метод с аргументом
        myexample.Set(101);
        System.out.println("Число = "+myexample.PrintInt());

        //присвоение значения меньше 0 полю через метод с аргументом
        myexample.Set(-5);
        System.out.println("Число = "+myexample.PrintInt());

        //присвоение значение полю через метод без аргуметов
        myexample.Set();
        System.out.println("Число = "+myexample.PrintInt());
    }
}
