package lr7.Example4;

public class FirstClass {
    public char character;
    public FirstClass(char character) {
        this.character = character;
    }
    public FirstClass(FirstClass obj) {
        this.character = obj.character;
    }
}
