public class Employee {
    int empid;
    String name;
    double salary;

     public Employee(int a){
        System.out.println("Employee Constructor");

     }

     public Employee(){
         //default constructor
         empid = 0;
         name = "";
         salary = 0.0;
     }

     public Employee(int empid, String name, double salary) {
         //parameterized constructor
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void main() {
        Employee e1 = new Employee(4);
        e1.setEmpid(122);
        e1.setName("John Doe");
        e1.setSalary(50000.0);
        e1.printDetails();
        System.out.println("------------------------------------------------------");
        Employee e2 = new Employee(123, "Jane Smith", 60000.0);
        e2.printDetails();

    }
}
