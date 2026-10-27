package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameExample {
    static void main() throws InvalidException, InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
try {
    int age = sc.nextInt();
    System.out.println("your age is " + age);
}catch(InputMismatchException ex){
//System.err.println("invalid age");
    throw new InvalidAgeException("invalid age");
}

    }
}
