package lr7.Example3;

public class SubClass2 extends SubClass1 {
    public String text;
    public SubClass2(int number, char character, String text) {
        super(number, character);
        this.text = text;
    }
    public void setValues(int number, char character, String text) {
        this.number = number;
        this.character = character;
        this.text = text;
    }
    @Override
    public String toString() {
        return "SubClass2: " + number + ", " + character + ", " + text;
    }
}
