package exception;

public class JavaException {
    public void test1() {
        test2();
    }
    public void test2() {
        test3();
    }

    public void test3() {
        try{
        test4();
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }

    public void test4() {
        test5();
    }
    public void test5() throws ArithmeticException, StringIndexOutOfBoundsException {
            String s="qwerty";
            s.charAt(10);
            int i = 10 / 10;
            System.out.println(i);
    }
    static void main() {
        JavaException obj = new JavaException();
        obj.test1();
    }
}
