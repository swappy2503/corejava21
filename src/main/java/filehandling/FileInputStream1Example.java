package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1Example {
    static void main() {
        FileInputStream fis=null;
        try {
            fis =new FileInputStream("C:\\AI\\aq.txt");
            int o;
            while((o=fis.read())!=-1){
                System.out.print((char)o);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
