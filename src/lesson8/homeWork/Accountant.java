package lesson8.homeWork;

public class Accountant extends Worker {

    public Accountant(int age, String name, long salary, String department) {
        super(age, name, salary);
        this.department = department;
    }

    public void printSmt(){
        super.printSmth();
        super.getSalary();
    }

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
