package java8;

import java.util.Optional;

public class Example2 {
    static void main() {
        test(null);
    }
    public static void test(String str){
       Optional<String> obj= Optional.ofNullable(str);
       if(obj.isPresent()){
           System.out.println("String is not null");
            str.charAt(11);
       }else{
           System.out.println("String is null");
       }
    }
}
