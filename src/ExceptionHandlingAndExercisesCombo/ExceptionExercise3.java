package ExceptionHandlingAndExercisesCombo;

public class ExceptionExercise3 {

    public static void main(String[]args){

        AgeValaditation av = new AgeValaditation("Lwin",30);
        AgeValaditation av2 = new AgeValaditation("Phyo", 70);
        AgeValaditation av3 = new AgeValaditation("LwinPhyo", 40);

        try {
            System.out.println("Testing");
//            av.ageCheckin(av.age);
//            System.exit(0);
            av2.ageCheckin(av2.age);
//            av3.ageCheckin(av3.age);
        }catch (AgeCheckExcept e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}

class AgeCheckExcept extends Exception{

    public AgeCheckExcept(String message){
        super(message);
    }
}

class AgeValaditation {
    String name; int age;
    AgeValaditation(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void ageCheckin(int age) throws AgeCheckExcept{

            if(age<35){
                throw new AgeCheckExcept("Under Age");
            }
            else if (age>60) {
                throw new AgeCheckExcept("Over Age");
            }
            else{
                System.out.println("Age is valid");
            }

    }
}