package FreshCoffee_Practice2;

public class OverloadingTestDe {
    public static void main(String[] args) {

        Company comp = new Company();
        comp.setInfo("Changan");
        comp.displayInfo();  // Calls no-argument displayInfo()

        comp.displayInfo("CHANGAN GROUP", 80);  // Calls no-argument displayInfo()

        // Calling overloaded displayInfo() with arguments
        comp.displayInfo("Mazada");
        comp.displayInfo("Honda", 75);

    }
}
class Company{
    private String name;
    private int age;

    void displayInfo(){
        System.out.println("Company name is : "+ name);
    }
    void displayInfo(String name){
        System.out.println("Company name is : "+ name);
    }
    void displayInfo(String name, int age){
        System.out.println("Company name is : "+ name);
        System.out.println("this company was founded at "+age+" years ago.\n");
    }

    void setInfo(String name){
        this.name = name;
    }

    void setInfo(String name, int age){
        this.name = name; this.age = age;
    }

}
