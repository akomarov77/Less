package Lesson11;

import java.util.*;

public class Lesson11 {

    public static List<Integer> searchInArrayList(List<Integer> list,
                                                  Integer searchCriteria) {
        List<Integer> results = new ArrayList<>();
        for (Integer item : list) {
            if (item.equals(searchCriteria)) {
                results.add(item);
            }
        }

        return results;
    }

    public static List<Integer> reverseInArrayList(List<Integer> list) {
    /*  List<Integer> results = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            results.add(list.get(i));
        }*/
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        List<Integer> searchResult = searchInArrayList(testList, 88);
        //List<Integer> reverseResult = reverseInArrayList(testList);
        Collections.reverse(testList);
        System.out.println(testList);

        //Collections.shuffle(testList);
        System.out.println(testList);

        int lookup = Collections.binarySearch(testList, 3);
        System.out.println("BiSearch: " + lookup);
        System.out.println("Lookup value:" + testList.get(lookup));

        Set<Integer> testSet = new HashSet<>();
        System.out.println("Add 4: " + testSet.add(4));
        System.out.println("Add 3: " + testSet.add(3));
        System.out.println("Add 5: " + testSet.add(5));
        System.out.println("Add 3: " + testSet.add(3));
        System.out.println(testSet);

        Set<String> testSetString = new TreeSet<>();
        testSetString.add("1");
        testSetString.add("A");
        testSetString.add("a");
        testSetString.add("2");
        System.out.println(testSetString);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        Auto auto1 = new Auto(5000, "Ford", 1222l);
        Auto auto2 = new Auto(6000, "Toyota", 1322l);
        Auto auto3 = new Auto(2000, "Honda", 1022l);
        Set<Auto> autoSet = new TreeSet<>();
        autoSet.add(auto1);
        autoSet.add(auto2);
        autoSet.add(auto3);
        System.out.println(autoSet);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        MyAutoComparator priceComparator = new MyAutoComparator();
        Set<Auto> autoSetWithComparator = new TreeSet<>(priceComparator);
        autoSetWithComparator.add(auto1);
        autoSetWithComparator.add(auto2);
        autoSetWithComparator.add(auto3);
        System.out.println(autoSetWithComparator);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Set<Auto> setWithAnonymComparator = new TreeSet<>(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        });
        setWithAnonymComparator.add(auto1);
        setWithAnonymComparator.add(auto2);
        setWithAnonymComparator.add(auto3);

        System.out.println(setWithAnonymComparator);
    }
}
