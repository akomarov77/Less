package myClasses;

public class Men {
    public static final Integer MAN = 1;
    public static final Integer WOMAN = 2;

    private String firstName;
    private String lastName;
    private int age;
    private Integer experience;
    private Integer gender;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(Integer g) {
        this.gender = g;
    }

    public Integer getGender() {
        return this.gender;
    }
}
