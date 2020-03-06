package Lesson10;

public class Main {
    public static void main(String[] args) {

        MyClass obj = new MyClass();
        MyClass.ProfessionalData proData = obj.new ProfessionalData();
        MyClass.InnerStatic innerSt = new MyClass.InnerStatic();

        MyInterface anonymousInitObject = new MyInterface() {
            @Override
            public void doSmt1() {
                System.out.println("Do smth 1");
            }

            @Override
            public void doSmt2() {
                System.out.println("Do smth 2");
            }
        };
        anonymousInitObject.doSmt1();
        anonymousInitObject.doSmt2();

        MyAbstractClass myAbstractObj = new MyAbstractClass() {
            @Override
            public void doAbstrStuff1() {
                System.out.println("doAbstrStuff1..");
            }

            @Override
            public void doAbstrStuff2() {
                System.out.println("doAbstrStuff2..");
            }
        };
        myAbstractObj.doAbstrStuff1();
        myAbstractObj.doAbstrStuff2();
        myAbstractObj.getMyInt();
    }
}
