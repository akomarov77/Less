package lesson6;

import myClasses.Men;
import myClasses.Triangle;


public class Lesson6 {
    public static void main(String[] args) {
        Men m = new Men();
        m.setGender(Men.WOMAN);
        m.setFirstName("Joe");
        //System.out.println("FName: " + m.getFirstName());

        int sideA = 78;
        int sideB = 78;
        int sideC = 78;
        Triangle triangle1 = new Triangle(sideA, sideB, sideC);
        int perim1 = triangle1.calculatePerimetr();
        System.out.println("Perim is: " + perim1);
        System.out.println("A = " + triangle1.getA());
        triangle1.setA(74);
        System.out.println(triangle1.calculatePerimetr());
    }
}
