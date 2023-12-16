package lr5.Example1;

public class Main1 {

    private char ch;

    public void setCh(char ch1) {
        this.ch = ch1;
    }
    public char getCh() {
        return ch;
    }
    public void view(){
        System.out.println("ch1 = " +ch);
        int code = ch;
        System.out.println("ch1 = "+code);
    }

}
