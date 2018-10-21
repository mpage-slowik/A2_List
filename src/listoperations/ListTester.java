package listoperations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Max Page-Slowik
 * @author Jesse Silber
 */
public class ListTester {

    public ListTester() {

    }
    /**
     * Runs insert and remove methods on the different collections.
     */
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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N.length-1; i++) {
            if(N[i] == 10){
            sb.append("N = ").append(N[i]).append(" \t\t| Insert@start(ms) \t| Insert@end (ms) \t| Insert@random(ms) \t|\r\n");
            sb.append("MyArrayList \t| ").append(insertStart(myArr, N[i])).append(" \t\t\t| ").append(insertEnd(myArr, N[i])).append(" \t\t\t| ").append(insertRandom(myArr, N[i])).append(" \t\t\t|\r\n");
            sb.append("ArrayList \t| ").append(insertStart(arr, N[i])).append(" \t\t\t| ").append(insertEnd(arr, N[i])).append(" \t\t\t| ").append(insertRandom(arr, N[i])).append(" \t\t\t|\r\n");
            sb.append("MyLinkedList \t| ").append(insertStart(myLList, N[i])).append(" \t\t\t| ").append(insertEnd(myLList, N[i])).append(" \t\t\t| ").append(insertRandom(myLList, N[i])).append(" \t\t\t|\r\n");
            sb.append("LinkedList \t| ").append(insertStart(lList, N[i])).append(" \t\t\t| ").append(insertEnd(lList, N[i])).append(" \t\t\t| ").append(insertRandom(lList, N[i])).append(" \t\t\t|\r\n");

            sb.append("N = ").append(N[i]).append(" \t\t| Remove@start(ms) \t| Remove@end (ms) \t| Remove@random(ms) \t| Remove byvalue (ms) \t|\r\n");
            sb.append("MyArrayList \t| ").append(removeStart(myArr, N[i])).append(" \t\t\t| ").append(removeEnd(myArr, N[i])).append(" \t\t\t| ").append(removeRandom(myArr, N[i])).append(" \t\t\t| ").append(removeByValue(myArr, N[i])).append(" \t\t\t|\r\n");
            sb.append("ArrayList \t| ").append(removeStart(arr, N[i])).append(" \t\t\t| ").append(removeEnd(arr, N[i])).append(" \t\t\t| ").append(removeRandom(arr, N[i])).append(" \t\t\t| ").append(removeByValue(arr, N[i])).append(" \t\t\t|\r\n");
            sb.append("MyLinkedList \t| ").append(removeStart(myLList, N[i])).append(" \t\t\t| ").append(removeEnd(myLList, N[i])).append(" \t\t\t| ").append(removeRandom(myLList, N[i])).append(" \t\t\t| ").append(removeByValue(myLList, N[i])).append(" \t\t\t|\r\n");
            sb.append("LinkedList \t| ").append(removeStart(lList, N[i])).append(" \t\t\t| ").append(removeEnd(lList, N[i])).append(" \t\t\t| ").append(removeRandom(lList, N[i])).append(" \t\t\t| ").append(removeByValue(lList, N[i])).append(" \t\t\t|\r\n");
        
            }else{
            sb.append("N = ").append(N[i]).append(" \t| Insert@start(ms) \t| Insert@end (ms) \t| Insert@random(ms) \t|\r\n");
            sb.append("MyArrayList \t| ").append(insertStart(myArr, N[i])).append(" \t\t\t| ").append(insertEnd(myArr, N[i])).append(" \t\t\t| ").append(insertRandom(myArr, N[i])).append(" \t\t\t|\r\n");
            sb.append("ArrayList \t| ").append(insertStart(arr, N[i])).append(" \t\t\t| ").append(insertEnd(arr, N[i])).append(" \t\t\t| ").append(insertRandom(arr, N[i])).append(" \t\t\t|\r\n");
            sb.append("MyLinkedList \t| ").append(insertStart(myLList, N[i])).append(" \t\t\t| ").append(insertEnd(myLList, N[i])).append(" \t\t\t| ").append(insertRandom(myLList, N[i])).append(" \t\t\t|\r\n");
            sb.append("LinkedList \t| ").append(insertStart(lList, N[i])).append(" \t\t\t| ").append(insertEnd(lList, N[i])).append(" \t\t\t| ").append(insertRandom(lList, N[i])).append(" \t\t\t|\r\n");

            sb.append("N = ").append(N[i]).append(" \t| Remove@start(ms) \t| Remove@end (ms) \t| Remove@random(ms) \t| Remove byvalue (ms) \t|\r\n");
            sb.append("MyArrayList \t| ").append(removeStart(myArr, N[i])).append(" \t\t\t| ").append(removeEnd(myArr, N[i])).append(" \t\t\t| ").append(removeRandom(myArr, N[i])).append(" \t\t\t| ").append(removeByValue(myArr, N[i])).append(" \t\t\t|\r\n");
            sb.append("ArrayList \t| ").append(removeStart(arr, N[i])).append(" \t\t\t| ").append(removeEnd(arr, N[i])).append(" \t\t\t| ").append(removeRandom(arr, N[i])).append(" \t\t\t| ").append(removeByValue(arr, N[i])).append(" \t\t\t|\r\n");
            sb.append("MyLinkedList \t| ").append(removeStart(myLList, N[i])).append(" \t\t\t| ").append(removeEnd(myLList, N[i])).append(" \t\t\t| ").append(removeRandom(myLList, N[i])).append(" \t\t\t| ").append(removeByValue(myLList, N[i])).append(" \t\t\t|\r\n");
            sb.append("LinkedList \t| ").append(removeStart(lList, N[i])).append(" \t\t\t| ").append(removeEnd(lList, N[i])).append(" \t\t\t| ").append(removeRandom(lList, N[i])).append(" \t\t\t| ").append(removeByValue(lList, N[i])).append(" \t\t\t|\r\n");
        
            }
        }
        Utilities.WriteToFile(sb.toString());
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
            list.add(list.size() - 1, randomInt);
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
        int randomLocation = (int) (Math.random() * (list.size() - 1));
        list.remove(randomLocation);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long removeByValue(List<Integer> list, int N) {
        long startTime = System.currentTimeMillis();
        int randomInt = (int) (2 * (Math.random() * N));
        boolean removed = list.remove((Integer) randomInt);
        long endTime = System.currentTimeMillis();
        while (!removed) {
            startTime = System.currentTimeMillis();
            randomInt = (int) (2 * (Math.random() * N));
            removed = list.remove((Integer) randomInt);
            endTime = System.currentTimeMillis();
        }
        return (endTime - startTime);
    }

}
