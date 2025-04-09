package JavaHowTO;

public class htGetRecArea {
    public static void main (String[]args){

        rectangle rec = new rectangle();
        rec.setlen(19);
        rec.setwid(27);

        System.out.println(rec.getlen());
        System.out.println(rec.getwid());
        rec.recArea();
    }
}
class rectangle{

    private int len;
    private int wid;

    int getlen(){return len;}
    int getwid(){return wid;}

    void setlen(int len){this.len=len;}
    void setwid(int wid){this.wid=wid;}

    void recArea(){
        System.out.println("Area is : "+len*wid);
    }
}
