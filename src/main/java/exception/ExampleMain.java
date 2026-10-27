package exception;

import java.util.Scanner;

public class ExampleMain {
    static void main() {
        System.out.println("Please enter your phone number");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        System.out.println("Phone number entered: " + phoneNumber);
        try {
            Long phoneNumberLong = Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            try {
                throw new PhoneNumberException("Phone number must be numeric");
            } catch (PhoneNumberException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
                return;
        }


        if(phoneNumber.length() != 10) {
            try {
                throw new PhoneNumberException("Phone number must be 10 digits long");
            } catch (PhoneNumberException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Valid phone number");
        }
    }
}
