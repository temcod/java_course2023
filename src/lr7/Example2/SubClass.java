package lr7.Example2;
public class SubClass extends SuperClass {
    public int number;

    public SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    public void setText() {
        setText("Default Text");
    }

    public void setText(String text) {
        super.setText(text);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTextAndNumber(String text, int number) {
        super.setText(text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


}
