package lr7.Example4;

public class ThirdClass extends SecondClass {
    public int number;
    public ThirdClass(char character, String text, int number) {
        super(character, text);
        this.number = number;
    }
    public ThirdClass(ThirdClass obj) {
        super(obj);
        this.number = obj.number;
    }
}
