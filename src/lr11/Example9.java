package lr11;
import java.util.ArrayList;
import java.util.List;
public class Example9 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple123");
        strings.add("watermelon$%");
        strings.add("ananas");
        strings.add("avocado9");

        List<String> filteredStrings = filterAlphabeticStrings(strings);

        for (String str : filteredStrings) {
            System.out.println(str);
    }
}
    public static List<String> filterAlphabeticStrings(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }
}
