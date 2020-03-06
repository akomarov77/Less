package Lesson10.alg;

import java.util.List;

public class AlgorithmUtils {
    public static int[] generateArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            int element = (int) (Math.random() * 1000);
            array[i] = element;
        }
        return array;
    }

    // O(1)
    public static void printLength(int[] array) {
        System.out.println("Array length: "
                + array.length);
    }
    //O(n)
    public static void printLMax(int[] array) {
        int max = 0;
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        System.out.println("Max: " + max);
    }

    public static List<Integer> getList(int count){
        //TODO ..
        return null;
    }

    public static void printList(List<Integer> list){
        //TODO print all items
    }
}
