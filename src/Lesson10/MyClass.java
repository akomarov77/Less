package Lesson10;

import java.util.Objects;

public class MyClass {
    private int myPropertyInt;
    private String myPropertyString;
    private ProfessionalData professionalData;

/*    public MyClass(int myPropertyInt, String myPropertyString, ProfessionalData professionalData) {
        this.myPropertyInt = myPropertyInt;
        this.myPropertyString = myPropertyString;
        this.professionalData = professionalData;
    }*/

    public class ProfessionalData {
        public ProfessionalData() {
            this(12, 12, "er");
            System.out.println("Hello from Default!!!");
        }

        public ProfessionalData(int salary, int taxes, String department) {
            //this();
            this.salary = salary;
            this.taxes = taxes;
            this.department = department;
        }

        private int salary;
        private int taxes;
        private String department;
    }

    public static class InnerStatic {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass)) return false;
        MyClass myClass = (MyClass) o;
        return myPropertyInt == myClass.myPropertyInt &&
                Objects.equals(myPropertyString, myClass.myPropertyString) &&
                Objects.equals(professionalData, myClass.professionalData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myPropertyInt, myPropertyString, professionalData);
    }
}
