package Lesson11.generic;

public abstract class InsuranceCompany <T extends Person> {
    public void issuePolicy(T person) {
        System.out.println("Request to Registry...");
        System.out.println("Comission agreement ...");

        registratePolicyLocally(person);

        System.out.println("Issue Policy");
        System.out.println("Delivery Policy");
    }

    protected abstract void registratePolicyLocally(T person);

}
