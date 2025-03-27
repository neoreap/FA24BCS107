public class Principal extends Person {
    private int yearsOfExperience;

    public Principal(String fullName, int age, int yearsOfExperience) {
        super(fullName, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Principal: " + super.toString() + 
               " (Experience: " + yearsOfExperience + " years)";
    }
}