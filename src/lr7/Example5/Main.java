package lr7.Example5;

public class Main {
    public static void main(String[] args) {
        SubClass1 obj1 = new SubClass1("Hello", 10);
        SubClass2 obj2 = new SubClass2("World", 'A');

        obj1.displayInfo();
        obj2.displayInfo();

        SuperClass superObj = obj1;
        superObj.displayInfo();
    }
}
