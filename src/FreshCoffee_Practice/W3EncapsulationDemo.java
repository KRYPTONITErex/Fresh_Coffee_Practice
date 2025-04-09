package FreshCoffee_Practice;

public class W3EncapsulationDemo {

    public static void main(String[]args){

        person pr = new person();
        pr.setName("Lwin");
        pr.setAge(25);
        System.out.println(pr.getName());
        System.out.println(pr.getAge());
    }
}

class person{
    private String name;
    private int age;

    //getter
    String getName(){ return  name; }
    int getAge(){ return age; }

    //setter
    void setName(String name){ this.name = name; }
    void  setAge(int age){ this.age = age; }
}
