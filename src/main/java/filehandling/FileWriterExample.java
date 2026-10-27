package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    static void main() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        fw = new FileWriter("C:\\AI\\output.txt", true);
        bw = new BufferedWriter(fw);
        String str = "Hello World";
        try {
            bw.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
