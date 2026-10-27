package exception;

public class Example {
    public void sample() throws StringIndexOutOfBoundsException, NumberFormatException {
        String str = "qwerty";
        char c = str.charAt(1);
        System.out.println(c);
        int i = Integer.parseInt("qwerty");
        System.out.println(i);
    }

    static void main() {
        Example oo = new Example();
        try {
            oo.sample();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index not in range");
        } catch (NumberFormatException e) {
            System.out.println(" cannot convert string to number");
        }
    }
}