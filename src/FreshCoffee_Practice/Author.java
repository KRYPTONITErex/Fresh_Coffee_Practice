package FreshCoffee_Practice;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name; this.email=email; this.gender=gender;
    }

    public String getName(){return name;}
    public String getEmail(){return email;}
    public char getGender(){return gender;}

    public void setEmail(String email){this.email=email;}
    public void setName(String name){this.name=name;}

    public String toString(){
        return String.format("%s (%c) at %s",name,gender,email);
    }
}
