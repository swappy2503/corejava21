package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1Example {
    static void main() {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("C:\\AI\\output.txt",true);
            String str="Hello World";
            fos.write(str.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
