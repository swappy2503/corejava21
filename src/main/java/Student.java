public class Student {
    private  int rollNo;
    private String name;
    private double percentage;
    final double pi=3.14;
    static int count=0;
/// <access-modifier> <classname>(<parameters>) { <body> }
    public Student(){
        //System.out.println("Student Constructor");
        rollNo=0;
        name="";
        percentage=0.0;
        count++;
    }
public Student(int rollNo, String name, double percentage){
        this(rollNo,name);
        this.percentage=percentage;
}
public Student(int rollNo, String name){
        this(rollNo);
        this.name=name;
        this.percentage=0.0;
}
public Student(int rollNo){
    this.rollNo=rollNo;
    count++;
}

/// <accessmodifier> <return type> <methodname>(<parameters>) { <body> }
    public void printDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
    }
    public static void printCount(){
        System.out.println("Count: "+count);
    }

    public int getRollNo() {
        return rollNo;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setRollNo(int r) {
        rollNo = r;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}