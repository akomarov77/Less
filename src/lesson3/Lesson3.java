package lesson3;

public class Lesson3 {
    //Home work
    static boolean isTrianglePossible(int a, int b, int c) {
/*        if(a+b <c){
            return false;
        }else  if(b+c<a){
            return false;
        }
        return true;*/

        //System.out.println();
        System.out.println();

        if ((a + b > c) && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    //Sum of array elements:
    static int getSum() {
        int[] house = {-167, -2324, -3234, -99999999};
        int sum = 0;
        for (int i = 0; i < house.length; i++) {
            int currentCell = house[i];
            //sum = sum + currentCell;
            sum += currentCell;
        }
        return sum;
    }

    //Find max element in array:
    static int getMax() {
        int[] array = {-167, -2324, -3234, -99999999};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max elem: " + max);
        return max;
    }

    //Use while loop for finding Sum of array elements:
    static long whileSum() {
        long[] train = {34, 45, 70};
        long sum = 0;
        int i = 0;
        while (i < train.length) {
            sum = sum + train[i];
            i++;
        }
        System.out.println("Sum while-loop: " + sum);
        return sum;
    }

    //Use while loop for finding Max element in array:
    static long whileMin() {
        long[] train = {3774, 455555, 7354450};
        long min = train[0];
        int i = 1;
        while (i < train.length) {
            if (train[i] < min) {
                min = train[i];
            }
            i++;
        }
        System.out.println("Min element while-loop: " + min);
        return min;
    }

    public static void main(String[] args) {
        getSum();
        getMax();

        whileSum();
        whileMin();

        //2 Dimensional Array:
        String[][] group = {
                {"N1", "N2", "N3"},
                {"I1", "I2", "I3"},
                {"K1", "K2", "K3"}
        };

        //Iteration trow two dimensional  array:
        //Print array content:
        for (int i = 0; i < group.length; i++) {
            //String[] row = group[i];
            for (int j = 0; j < group[i].length; j++) {
                String name = group[i][j];
                System.out.print("[" + i + "," + j + "] = " + name + " ");
            }
            System.out.println();
        }
    }
}
