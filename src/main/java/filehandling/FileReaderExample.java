package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    static void main() {
        FileReader fileReaderObj=null;
        BufferedReader bufferedReaderObj=null;
        try {
            fileReaderObj = new FileReader("C:\\AI\\output.txt");
            bufferedReaderObj = new BufferedReader(fileReaderObj);
            int o;
            while((o=bufferedReaderObj.read())!=-1){
                System.out.print((char)o);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                bufferedReaderObj.close();
                fileReaderObj.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
