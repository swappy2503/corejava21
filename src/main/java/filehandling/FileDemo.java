package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    static void main() {
        File fileObj=new File("C:\\");

        File[] arr=fileObj.listFiles();

        for(int i=0;i<arr.length;i++) {
            String str = arr[i].getAbsolutePath();
            File file=new File(str);
            if(file.isDirectory()){
                System.out.println(file.getAbsolutePath()+" - folder");
            }else{
                System.out.println(file.getAbsolutePath()+"- file");
            }
        }
    }
}
