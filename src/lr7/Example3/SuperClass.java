package lr7.Example3;

public class SuperClass {
    public int number;

    public SuperClass(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "SuperClass: " + number;
    }
}
