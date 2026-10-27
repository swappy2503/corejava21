package inheritance;

public class BMWClass extends Car{
    @Override
    public void setFuelType(String fuelType) {
        super.setFuelType(fuelType);
    }
    public void test(){
        System.out.println("This is BMW class");
    }
    public void test(String str){
        System.out.println("This is BMW class with parameter: " + str);
    }
    public void test(String str1, String str2){
        System.out.println("This is BMW class with parameter: " + str1);
    }

    public BMWClass(String registrationNumber, String model, String color, String engineType) {
        super(registrationNumber, model, color, engineType);
    }
    static void main() {
        BMWClass obj=new BMWClass("KA-01-1234","BMW X5","White","Petrol");
        obj.test();
        obj.setFuelType("Petrol");

    }
}