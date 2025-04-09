package Engineers;

public class MechanicalEngineer extends AbstractEngineer {

    MechanicalEngineer(String major) {
        super(major);
    }

    @Override
    public void specializedMajor() {
        System.out.println("This Engineering students choose "+major);
    }

    @Override
    public void eatFood() {
        System.out.println("This Engineering students eat Mechanical food");
    }

    @Override
    public void drink() {

    }

    @Override
    public void work() {

    }

    @Override
    public void rest() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void listen() {

    }
}
