package lesson7;

import java.util.Scanner;

public class CircleX extends Shape {
    public CircleX(int r) {
        side = r;
        /*printBlah();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input radius size for CIRCLE: ...");
        int radiusFromConsole = scanner.nextInt();
        radius = radiusFromConsole;*/
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("bai bai ...");
    }


    @Override
    public int calculatePerim() {
        printFromCircle();
        int result = (int) (2 * Math.PI * side);
        System.out.println("Perimetr for CircleX: " + result);
        return result;
    }

    public void printFromCircle(){
        System.out.println("Circle!!!");
    }


    //TODO  add getters and setters...
}
