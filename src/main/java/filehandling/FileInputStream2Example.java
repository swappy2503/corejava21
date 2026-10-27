package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream2Example {
    static void main() {
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        try {
            fis =new FileInputStream("C:\\AI\\aq.txt");
            bis=new BufferedInputStream(fis);
            int o;
            while((o=bis.read())!=-1){
                System.out.print((char)o);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
