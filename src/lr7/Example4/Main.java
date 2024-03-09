package lr7.Example4;

public class Main {
    public static void main(String[] args) {
        ThirdClass obj1 = new ThirdClass('A', "Hello", 10);
        ThirdClass obj2 = new ThirdClass(obj1);

        System.out.println("Object 1: " + obj1.character + ", " + obj1.text + ", " + obj1.number);
        System.out.println("Object 2: " + obj2.character + ", " + obj2.text + ", " + obj2.number);
    }
}
