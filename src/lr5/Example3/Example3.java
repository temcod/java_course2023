package lr5.Example3;

public class Example3 {

    public int number1;
    public int number2;

    public Example3(){
        number1 = 1;
        number2 = 2;
    }
    public Example3(int arg1){
        number1 = arg1;
        number2 = 2;
    }
    public Example3(int arg1, int arg2){
        number1 = arg1;
        number2 = arg2;
    }
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
