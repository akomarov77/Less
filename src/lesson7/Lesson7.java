package lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(new Point(1, 1),
                new Point(5, 1),
                new Point(3, 2));
        System.out.println("Perim of " + tr1 + "is: "
                + tr1.calculatePerim());

        Shape square1 = new SquareX(6);
        //Shape sh  =  new SquareX();
        Shape circle1 = new CircleX(3);
        circle1 = square1;

        if (circle1 instanceof SquareX) {
            SquareX sq = (SquareX) circle1;
        }


        Shape square2 = new SquareX(8);
        Shape circle2 = new CircleX(4);


        circle1.calculatePerim();

       /* Shape[] basket = {square1, square2, circle1, circle2};
        int maxPerim = 0;
        for (int i = 0; i < basket.length; i++) {
            Shape shape = basket[i];
            int currentPerim = shape.calculatePerim();
            if (currentPerim > maxPerim) {
                maxPerim = currentPerim;
            }
        }*/
    }
}
