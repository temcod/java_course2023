package lr5.Example2;

public class Main2 {

    public char ch1;
    public char ch2;

    public void setCh(char ch_1, char ch_2) {
        this.ch1 = ch_1;
        this.ch2 = ch_2;
    }
    public void result () {

        char a = ch1;
        char b = ch2;
        if (ch1>ch2) {
            a = ch2;
            b = ch1;
        }
        int number = 1;
        for (int i = a; i<=b; i++) {
            System.out.println(number + " символ = " + (char) i);
            number++;
        }
    }

}
