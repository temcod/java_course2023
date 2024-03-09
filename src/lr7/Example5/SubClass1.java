package lr7.Example5;

public class SubClass1 extends SuperClass{
    protected int number;

    public SubClass1(String text, int number) {
        super(text);
        this.number = number;
    }
    @Override
    public void displayInfo() {
        System.out.println("Class: SubClass1, Text: " + text + ", Number: " + number);
    }
}
