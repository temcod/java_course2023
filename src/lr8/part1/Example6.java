package lr8.part1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("/Users/alexander/Desktop/MyFile1.txt");
            out = new FileWriter("/Users/alexander/Desktop/MyFile2.txt", true);

            int oneByte;
            while((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}
