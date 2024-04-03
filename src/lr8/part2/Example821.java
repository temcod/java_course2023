package lr8.part2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Example821 {
    public static void main(String[] args) {

        String aString = "Пример первой строки\nПример второй строки\n3.2\n2.67\n-100.0\n9.8\n-23.6";
        try {
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("newFile.txt"), StandardCharsets.UTF_8));
            try {
                out.write(aString);
            } catch (Exception e) {
                try {
                    out.close();
                } catch (Exception r) {
                    e.addSuppressed(e);
                }
                throw e;
            }
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/alexander/Desktop/input.txt"), StandardCharsets.UTF_8));
            out = new PrintWriter("/Users/alexander/Desktop/output.txt", StandardCharsets.UTF_8);
            int lineCount = 0;
            String s;
            while((s = br.readLine()) != null) {
                ++lineCount;
                if (lineCount == 2) {
                    out.println(s);
                }
                if (lineCount > 2 && Double.parseDouble(s) >= 0.0) {
                    out.println(s);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            out.flush();
            out.close();
        }
    }
}
