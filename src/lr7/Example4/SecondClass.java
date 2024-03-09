package lr7.Example4;

public class SecondClass extends FirstClass {
    public String text;
    public SecondClass(char character, String text) {
        super(character);
        this.text = text;
    }
    public SecondClass(SecondClass obj) {
        super(obj);
        this.text = obj.text;
    }

}
