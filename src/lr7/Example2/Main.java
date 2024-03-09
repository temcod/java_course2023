package lr7.Example2;

public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass(10, "Hello");

        obj.setText();
        System.out.println("Text: " + obj.getTextLength());

        obj.setNumber(20);
        System.out.println("Number: " + obj.getNumber());

        obj.setText("World");
        System.out.println("Text: " + obj.getTextLength());

        obj.setTextAndNumber("Java", 30);
        System.out.println("Text: " + obj.getTextLength());
        System.out.println("Number: " + obj.getNumber());
    }

}
