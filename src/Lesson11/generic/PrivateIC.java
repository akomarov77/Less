package Lesson11.generic;

public class PrivateIC extends InsuranceCompany<Employee> {
    @Override
    protected void registratePolicyLocally(Employee employee) {
        System.out.println("Registrate in Private Company");
    }
}
