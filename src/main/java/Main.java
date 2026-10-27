import util.TestClass;

public class Main {
    static void main() {

        //1. class
        //2.objects
        //3. constructor
        //4. methods or functions
        //5. access modifiers
        //6. static and non-static


        Student s=new Student();
        s.setRollNo(11);
        s.setName("John");

        s.setRollNo(22);
        Student.printCount();
      //  System.out.println(s.getRollNo());
//s.printDetails();

    Student s1=new Student();//declaration and initialization
    Student.printCount();
    Student s2;//declaration
         new Student();//initialization
    Student s3=new Student(33,"Smith",88.5);
    s3.printDetails();
    Student.printCount();



    }
}
