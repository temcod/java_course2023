package lr5.Example4;
import java.util.*;

public class Main4 {
    // поля
    public char ch1;
    public int int1;

    //констуктор с 2 аргументами
    public Main4(int i, char a){
        int1 = i;
        ch1 = a;

        int lenght = (int) (Math.log10(int1) + 1);
        double result = (double) ch1 + (double) int1*1/Math.pow(10, lenght);
        System.out.println("result1 = "+result+"; ch = "+(double)ch1+ "; int = "+ lenght);
    }
    // конструктор с 1 аргументом
    public Main4(double b){
        // действительная часть аргумента определяет код символа, то есть значение символьного поля
        char ch1 = (char) b;
        //дробная часть с учетом десятых и сотых - значение целочисленного поля
        int1 = (int)((b -(int)b)*100);
        System.out.println(ch1);
        System.out.println(int1);

    }
}
