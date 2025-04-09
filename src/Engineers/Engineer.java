package Engineers;

public class Engineer {

    public static void main(String[] args) {
        System.out.println("Engineer");

        PersonBehaviour mechEngr = new MechanicalEngineer("Mechanical Engineering");
        ((MechanicalEngineer) mechEngr).specializedMajor();
//        mechEngr.doExam();
        mechEngr.eatFood();

        System.out.println();

        PersonBehaviour civilEngr = new CivilEngineer("Civil Engineering");
        ((CivilEngineer) civilEngr).specializedMajor();
        civilEngr.eatFood();
    }
}
