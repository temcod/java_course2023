package lr6.Example10;

public class test10 {
    public static void main(String[] args) {

        Main10 myex1 = new Main10();
        Main10 myex2 = new Main10();
        myex1.calcMaxMin(1,3,-6,57,29,-101);
        myex1.viewMaxMin();
        Main10.calcMaxMin(7,8,9,2,34,-9,1,0);
        Main10.viewMaxMin();
        myex2.calcMaxMin(45,78,-99,-4,888,2,1,0);
        myex2.viewMaxMin();
    }
}
