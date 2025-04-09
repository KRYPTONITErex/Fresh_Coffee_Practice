package FreshCoffee_Practice2;

public class JavaInnerOuterDe {

    public static void main(String[]args){

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myInner.y);
        System.out.println(myOuter.x);

//        OuterClass.staticInnerClass myStaticInner = new OuterClass.staticInnerClass();
//        int res = myStaticInner.z;
//        System.out.println(res);

        System.out.println(myInner.displayOuterX());
    }
}

class OuterClass{
    int x =10;

    class InnerClass {
        int y = 5;
        int displayOuterX(){
            return x;
        }
    }

//    class staticInnerClass{
//        int z = 19;
//        int x;
//        int displayOuterX(){
//            return x;
//        }
//    }
}