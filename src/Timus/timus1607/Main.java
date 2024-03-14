package Timus.timus1607;

import java.io.*;

public class Main implements Runnable {
    private BufferedReader bufferedReader;
    private StreamTokenizer in;
    private PrintWriter out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream inputStream, OutputStream outputStream) {
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        in = new StreamTokenizer(bufferedReader);
        out = new PrintWriter(new OutputStreamWriter(outputStream));
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    public void run() {
        try {
            solve();
            out.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private double readNumber() throws IOException {
        int nextToken = in.nextToken();
        if (nextToken == StreamTokenizer.TT_NUMBER) {
            return in.nval;
        }
        throw new IllegalStateException("Number expected. Found: " + nextToken);
    }

    private String readWord() throws IOException {
        int nextToken = in.nextToken();
        if (nextToken == StreamTokenizer.TT_WORD) {
            return in.sval;
        }
        throw new IllegalStateException("Word expected. Found: " + nextToken);
    }

    //TODO global variables

    private void solve() throws Exception {
        int a = (int) readNumber();
        int da = (int) readNumber();
        int b = (int) readNumber();
        int db = (int) readNumber();
        int x = (int) Math.ceil(((float) b - a) / (da + db));
        if (x <= 0) {
            out.println(a);
        } else {
            out.println(Math.min(a + x * da, b - (x - 1) * db));
        }
    }
}