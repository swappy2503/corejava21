package filehandling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2Example {
    static void main() {
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        try {
            fos=new FileOutputStream("C:\\AI\\output.txt",true);
            bos=new BufferedOutputStream(fos);
            String str="Hello World";
            bos.write(str.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bos.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
