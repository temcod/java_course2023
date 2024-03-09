package lr7.Example5;

public class SubClass2 extends SuperClass{
    protected char character;
    public SubClass2(String text, char character) {
        super(text);
        this.character = character;
    }
    @Override
    public void displayInfo() {
        System.out.println("Class: SubClass2, Text: " + text + ", Character: " + character);
    }
}
