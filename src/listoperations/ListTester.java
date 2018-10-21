package listoperations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Max Page-Slowik
 * @author Jesse Silber
 */
public class ListTester {

    public ListTester() {

    }

    public static void run() {
        int N[] = {10, 100, 1000, 10000, 100000, 1000000};
        MyArrayList<Integer> myArr = new MyArrayList<>();
        MyLinkedList<Integer> myLList = new MyLinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> lList = new LinkedList<>();

        fill(myArr, N[0]);
        fill(arr, N[0]);

        fill(myLList, N[0]);
        fill(lList, N[0]);

//        long myArrayListInsertStart = insertStart(myArr, N[0]);
//        long myArrayListInsertEnd = insertEnd(myArr, N[0]);
//        long myArrayListInsertRandom = insertRandom(myArr, N[0]);
//        long myArrayListRemoveStart = removeStart(myArr, N[0]);
//        long myArrayListRemoveEnd = removeEnd(myArr, N[0]);
//        long myArrayListRemoveRandom = removeRandom(myArr, N[0]);
//        long myArrayListRemoveByValue = removeByValue(myArr, N[0]);
        for (int i = 0; i < N.length - 2; i++) {
            System.out.println("N = " + N[i] + " | " + "Insert@start(ms) | Insert@end (ms) | Insert@random(ms) |");
            System.out.println("MyArrayList | " + insertStart(myArr, N[i]) + " | " + insertEnd(myArr, N[i]) + " | " + insertRandom(myArr, N[i]) + " |");
            System.out.println("ArrayList | " + insertStart(arr, N[i]) + " | " + insertEnd(arr, N[i]) + " | " + insertRandom(arr, N[i]) + " |");
            System.out.println("MyLinkedList | " + insertStart(myLList, N[i]) + " | " + insertEnd(myLList, N[i]) + " | " + insertRandom(myLList, N[i]) + " |");
            System.out.println("LinkedList | " + insertStart(lList, N[i]) + " | " + insertEnd(lList, N[i]) + " | " + insertRandom(lList, N[i]) + " |");

            System.out.println("N = " + N[i] + " | " + "Remove@start(ms) | Remove@end (ms) | Remove@random(ms) | Remove byvalue (ms) |");
            System.out.println("MyArrayList | " + removeStart(myArr, N[i]) + " | " + removeEnd(myArr, N[i]) + " | " + removeRandom(myArr, N[i]) + " | " + removeByValue(myArr, N[i]) + " |");
            System.out.println("ArrayList | " + removeStart(arr, N[i]) + " | " + removeEnd(arr, N[i]) + " | " + removeRandom(arr, N[i]) + " | " + removeByValue(arr, N[i]) + " |");
            System.out.println("MyLinkedList | " + removeStart(myLList, N[i]) + " | " + removeEnd(myLList, N[i]) + " | " + removeRandom(myLList, N[i]) + " | " + removeByValue(myLList, N[i]) + " |");
            System.out.println("LinkedList | " + removeStart(lList, N[i]) + " | " + removeEnd(lList, N[i]) + " | " + removeRandom(lList, N[i]) + " | " + removeByValue(lList, N[i]) + " |");

        }

    }

    private static void fill(List<Integer> list, int N) {
        for (int i = 0; i < N; i++) {
            int randomInt = (int) (2 * (Math.random() * N));
            list.add(randomInt);
        }
    }

    private static long insertStart(List<Integer> list, int N) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            int randomInt = (int) (2 * (Math.random() * N));
            list.add(0, randomInt);
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);

    }

    private static long insertEnd(List<Integer> list, int N) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            int randomInt = (int) (2 * (Math.random() * N));
            list.add(list.size(), randomInt);
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long insertRandom(List<Integer> list, int N) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            int randomLocation = (int) (Math.random() * (list.size() - 1));
            int randomInt = (int) (2 * (Math.random() * N));
            list.add(randomLocation, randomInt);
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long removeStart(List<Integer> list, int N) {
        long startTime = System.currentTimeMillis();
        list.remove(0);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long removeEnd(List<Integer> list, int N) {
        long startTime = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long removeRandom(List<Integer> list, int N) {
        long startTime = System.currentTimeMillis();
        int randomLocation = (int) (Math.random() * (list.size()));
        list.remove(randomLocation);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long removeByValue(List<Integer> list, int N) {
        long startTime = System.currentTimeMillis();
        int randomInt = (int) (2 * (Math.random() * N));
        list.remove((Object) randomInt);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

}
