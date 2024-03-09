package lr7.Example1;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return "SuperClass: " + text;
    }
}
