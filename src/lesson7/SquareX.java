package lesson7;

import java.util.Scanner;

public class SquareX extends Shape {

    public SquareX(int sideFromConsole) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input side size for SQUARE: ...");
        int sideFromConsole = scanner.nextInt();*/

        side = sideFromConsole;
    }

    @Override
    public int calculatePerim() {
        int result = 4 * side;
        System.out.println("Perimetr for Square: " + result);
        return result;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public void printFromSquare(){
        System.out.println("Square!!!");
    }
}
