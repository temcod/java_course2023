package lr7.Example3;

public class SubClass1 extends SuperClass {
    public char character;

    public SubClass1(int number, char character) {
        super(number);
        this.character = character;
    }

    public void setValues(int number, char character) {
        this.number = number;
        this.character = character;
    }

    @Override
    public String toString() {
        return "SubClass1: " + number + ", " + character;
    }
}
