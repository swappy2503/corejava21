package inhert2;
import java.util.Scanner;
public class Rectangle extends Shape implements Shapeable, Runnable{
    int l;
    int b;
    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectangle: ");
        int b=sc.nextInt();

        Rectangle rectangle= new Rectangle(l,b);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
    @Override
    public void calculateArea() {
        int area=l*b;
        System.out.println("Area of rectangle is: "+area);
    }
    @Override
    public void calculatePerimeter() {
        int perimeter=2*(l+b);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }

    @Override
    public void test1() {
        System.out.println("This is a rectangle");
    }

    @Override
    public void run() {

    }
}
