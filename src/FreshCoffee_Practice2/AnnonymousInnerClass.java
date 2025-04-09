package FreshCoffee_Practice2;

public class AnnonymousInnerClass {

    public static void main(String[]args){


        CanShoot cs = new Guns(){
            @Override
            public void shooting(String toEnemy){
                System.out.println("with Cannon can shoot to "+toEnemy);
            }
        };
        cs.shooting("Enemy in the Ocean");
    }
}

interface CanShoot{
    void shooting(String toEnemy);
}
class Guns implements CanShoot{

    @Override
    public void shooting(String toEnemy) {
        System.out.println("with guns can shoot to enemy.");
    }
}