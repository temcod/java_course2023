package lr7.Example1;

public class SubClass extends SuperClass{
    private String additionalText;
    public SubClass(String text, String additionalText) {
        super(text);
        this.additionalText = additionalText;
    }
    public SubClass(String text) {
        super(text);
    }
    @Override
    public String toString() {
        if (additionalText != null) {
            return "SubClass: " + getText() + ", " + additionalText;
        } else {
            return "SubClass: " + getText();
        }
    }
    private String getText() {
        return super.toString().substring(12);
    }

}
