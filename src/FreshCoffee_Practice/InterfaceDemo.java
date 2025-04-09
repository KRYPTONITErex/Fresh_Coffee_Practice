package FreshCoffee_Practice;

public class InterfaceDemo {
    public static void main(String [] args){
            Java jv = new Java();
            jv.learningDuration();
            jv.usage();

            Python py = new Python();
            py.learningDuration();
            py.usage();
    }
}
interface Language{
    void usage();
    void learningDuration();
}
class Java implements Language{
     public void usage(){
        System.out.println("use in desktop application.");
    }
    public void learningDuration(){
        System.out.println("\nJava will take 1 year to learn.");
    }
}
class Python implements Language{
    public void usage(){
        System.out.println("use in Ai learning");
    }
    public void learningDuration(){
        System.out.println("\nPython will take 6months to learn.");
    }
}
