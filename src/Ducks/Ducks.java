package Ducks;

public class Ducks {
    public static void main(String[]args){

        Duck mallardDuck = new MallardDuck("Donald Duck","Green",3);
//        mallardDuck.setName("Donald Duck"); mallardDuck.setColor("Green");
//        mallardDuck.setAge(3);
        mallardDuck.display();

        System.out.println();

        Duck rubberDuck = new RubberDuck("Dooby Duck","Yellow",1);
//        rubberDuck.setName("Dooby Duck"); rubberDuck.setColor("Yellow");
//        rubberDuck.setAge(1);
        rubberDuck.display();

        System.out.println();

        Duck rubberDuck2 = new RubberDuck("LP's toy duck","Blue",2);
//        rubberDuck2.setName("LP's toy duck"); rubberDuck2.setColor("blue");
//        rubberDuck2.setAge(2);
        rubberDuck2.display();

        System.out.println();

        Duck mallardDuck2 = new MallardDuck("Daist Duck","White",5);
//        mallardDuck2.setName("Daisy Duck"); mallardDuck2.setColor("white");
//        mallardDuck2.setAge(5);
        mallardDuck2.display();

    }
}