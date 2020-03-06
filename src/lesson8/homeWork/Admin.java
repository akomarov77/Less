package lesson8.homeWork;

public class Admin extends Worker {

    public Admin(int age, String name, long salary, String department) {
        super(age, name, salary);
        this.department = department;
    }

    public Admin(int age, String name, long salary) {
        super(age, name, salary);
        //this.department = null;
    }

    public Admin(String name) {
        super(0, null, 0);
        //this.department = null;
    }

    public Admin(int age, String name) {
        super(age, name, 0);
        //this.department = null;
    }

    public Admin(String salary, int department) {
        super(0, null, 0);
        //this.department = null;
    }


    public void doCoffee() {
        System.out.println("Pff..");
    }

    public void doTea() {
        System.out.println("Tea..");
    }

    public void doCoffee(int times) {
        for (int i = 0; i < times; i++) {
            doCoffee();
        }
    }

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
