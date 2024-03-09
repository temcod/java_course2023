package lr7.Example3;

public class Main {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass(10);
        SubClass1 obj2 = new SubClass1(20, 'A');
        SubClass2 obj3 = new SubClass2(30, 'B', "Hello");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
