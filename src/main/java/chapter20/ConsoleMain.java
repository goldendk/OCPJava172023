package chapter20;

import java.io.*;

public class ConsoleMain {
    public static void main(String... args){
        Console console = System.console();
        PrintWriter pw = new PrintWriter(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                throw new IOException("foo");
            }
        });

        pw.write("s");
        System.out.println(pw.checkError());

        InputStreamReader isr = new InputStreamReader(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });
        try {
            isr.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("build.gradle");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
