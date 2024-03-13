package lr11;
import java.util.ArrayList;
import java.util.List;
public class Example5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("table");
        strings.add("chair");
        strings.add("house");
        strings.add("wall");

        List<String> filteredStrings = filterStringsContainingSubstring(strings, "a");

        for (String str : filteredStrings) {
            System.out.println(str);
    }
}
    public static List<String> filterStringsContainingSubstring(List<String> strings, String subString) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.contains(subString)) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }
}
