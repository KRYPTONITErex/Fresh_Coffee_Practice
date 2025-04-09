package Engineers;

import EmployeeManagement.Person;

abstract class AbstractEngineer implements EngineeringStudentBehaviour, StudentBehavoiur, PersonBehaviour {

    String major;

    AbstractEngineer(String major){
        this.major = major;
    }

    @Override
    public void calculate() {

    }

    @Override
    public void doingPractically() {

    }

    @Override
    public void doingTheory() {

    }

    @Override
    abstract public void specializedMajor();

    @Override
    public void study() {

    }

    @Override
    public void playGames() {

    }

    @Override
    public void doHomework() {

    }

    @Override
    public void doProject() {

    }

    @Override
    public void doExam() {

    }

    @Override
    public void doAssignment() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void doResearch() {

    }

    @Override
    public void doPresentation() {

    }
}
