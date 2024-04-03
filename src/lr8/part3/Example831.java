package lr8.part3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Example831 {
    public static void main(String[] args) {
        String inputFile = "/Users/alexander/Desktop/input.txt";
        String outputFile = "/Users/alexander/Desktop/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+"); // Разбиваем строку на слова по пробелам

                int count = 0;
                for (String word : words) {
                    if (startsWithConsonant(word)) {
                        writer.write(lineNumber + ": " + word + "\n");
                        count++;
                    }
                }

                writer.write("Количество слов: " + count + "\n\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для определения начинается ли слово согласной буквой
    private static boolean startsWithConsonant(String word) {
        if (word.isEmpty()) {
            return false;
        }

        char firstLetter = Character.toLowerCase(word.charAt(0));
        return !(firstLetter == 'а' || firstLetter == 'е' || firstLetter == 'ё' ||
                firstLetter == 'и' || firstLetter == 'о' || firstLetter == 'у' ||
                firstLetter == 'ы' || firstLetter == 'э' || firstLetter == 'ю' ||
                firstLetter == 'я' || !Character.isLetter(firstLetter));
    }
}
