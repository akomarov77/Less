package Lesson11.generic;

public class GovenmentalIC extends InsuranceCompany<Citizen> {
    @Override
    protected void registratePolicyLocally(Citizen person) {
        System.out.println("Registrate in Governmental Company");
    }
}
