package FreshCoffee_Practice2;

public class koSaiPandRtypeDe {

    public static void main(String[]args){

//        int i = 1; // value type , stack
//    	i = 2; //
//
//    	int i2 = i;
//    	i2 = 3;
//
//    	System.out.println("i2 " + i2); // 3
//    	System.out.println("i " + i); // 2

        Integer i1 = 1; // store in heap, refrence type
//        i1 = 128;
//        i1 = i;

//        Integer i2 = i1;
//        i2 = 100;
//
//        System.out.println("i1 " + i1); // 128
//        System.out.println("i2 " + i2); // 100
//		System.out.println( i1 == i2 );
//
//    	String s = new String(); // store in heap, refrence type
//    	s = "345"; //
//
//    	String s2 = s; //
//    	s2 = "100";
//
//    	System.out.println("s" + s); // 100
//    	System.out.println("s2" + s2); // 100


    	String s = new String(); //

    	Dog d = new Dog(); // store in heap
    	d.setAge(3);

    	Dog d2 = d;
    	d2.setAge(4);

    	Dog d3 = d2;
    	d.setAge(5);

    	Dog d4 = new Dog();
    	d4 = d;
    	d4.setAge(300);

    	d2 = new Dog();
    	d2.setAge(3);

    	System.out.println("dog d object "+ d); //  15db9742
    	System.out.println("dog d2 object "+ d2); //  15db9742
    	System.out.println("dog d3 object "+ d3); //  15db9742
     	System.out.println("dog d4 object "+ d4); //  7f31245a

    	System.out.println("dog "+ d.getAge()); //  300
    	System.out.println("dog2 "+ d2.getAge()); // 3
    	System.out.println("dog3 "+ d3.getAge()); // 300
    	System.out.println("dog4 "+ d4.getAge()); // 300



//    	Dog d4 = new Dog();
//    	d4 = d;
//    	d4.setAge(300);

    	System.out.println(s);

    	System.out.println("dog d refrence value"+ d.toString()); //

    	System.out.println("dog d2 refrence value"+ d2); //


    	System.out.println("dog d3 refrence value"+ d3); // 5 // 15db9742


    	System.out.println("dog d4 refrence value"+ d4); // 3 // 15db9742


        // how stack works
        //method, primitive data type

        //how heap works
        //object and refrence data type

//    	dog d refrence valueDog@15db9742
//    	dog d2 refrence valueDog@15db9742

//    	Dog d3 = d2;
//    	d3.setAge(10);

    	d.setAge(1);

    	d3 = new Dog();
    	d3.setAge(1);

    	if( d2  == d3) {
    		System.out.println("==");
    	}else {
    		System.out.println("!=");
    	}

    	if(d2.equals(d3)) {
    		System.out.println("equal object");
    	}else {
    		System.out.println("not equal object");
    	}

    }
}

class Animal{
    int age = 5;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    void eat(){
        System.out.println("Animal eats");
    }
    void sleep(){
        System.out.println("Animal sleeps");
    }
    public Animal( ) {
    	System.out.print("Animal");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
    public Dog(int i) {
        System.out.print("Dog" + i);
    }
    public Dog() {

    }
}

