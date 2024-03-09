package lr7.Example1;

public class Main {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Hello");
        SubClass obj2 = new SubClass("World");
        SubClass obj3 = new SubClass("Java", "Programming");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }

}
