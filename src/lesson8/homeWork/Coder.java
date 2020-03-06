package lesson8.homeWork;

public class Coder extends Worker {

    private String programmingLang;

    public Coder(int age, String name, long salary, String programmingLang) {
        super(age, name, salary);
        this.programmingLang = programmingLang;
    }

    public String getProgrammingLang() {
        return programmingLang;
    }

    public void setProgrammingLang(String programmingLang) {
        this.programmingLang = programmingLang;
    }
}
