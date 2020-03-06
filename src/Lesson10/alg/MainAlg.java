package Lesson10.alg;

import Lesson9.homeWork.Car;
import lesson7.Point;
import lesson7.Triangle;
import sun.security.util.ArrayUtil;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MainAlg {
    public static void main(String[] args) {
        // O(1)
        int[] arraySmall = AlgorithmUtils.generateArray(3);
        int[] arrayBig = AlgorithmUtils.generateArray(9999999);

        long timeStart = LocalDateTime.now().getNano();
       // AlgorithmUtils.printLength(arraySmall);
        AlgorithmUtils.printLMax(arraySmall);
        long timeFinish = LocalDateTime.now().getNano();
        long execTime = timeFinish - timeStart;
        System.out.println("Exec Time1: " + execTime);

        long timeStart2 = LocalDateTime.now().getNano();
        //AlgorithmUtils.printLength(arrayBig);
        AlgorithmUtils.printLMax(arrayBig);
        long timeFinish2 = LocalDateTime.now().getNano();
        long execTime2 = timeFinish2 - timeStart2;
        System.out.println("Exec Time2: " + execTime2);


        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);


    }
}
