/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listoperations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Max Page-Slowik
 */
public class ListTester {
    
    public ListTester(){
        
    }
    public static void run(){
        int N[] = {10,100,1000,10000,100000,1000000};
        MyArrayList<Integer> myArr = new MyArrayList<>();
        MyLinkedList<Integer> myLList = new MyLinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> lList = new LinkedList<>();
        
        fill(myArr,N[0]);
        insertStart(myArr,N[0]);
        insertEnd(myArr,N[0]);
        insertRandom(myArr,N[0]);
        removeStart(myArr,N[0]);
        removeEnd(myArr,N[0]);
        removeRandom(myArr,N[0]);
        removeByValue(myArr,N[0]);
  
    }
    private static void fill(List<Integer> list, int N){
        for(int i = 0; i<N;i++){
            int randomInt = (int)(2*(Math.random()*N));
            list.add(randomInt);
        }
        System.out.println(list.toString());
    }
    private static void insertStart(List<Integer> list, int N){
        for(int i = 0; i<N;i++){
        int randomInt = (int)(2*(Math.random()*N));
        list.add(0,randomInt);
        }
        System.out.println(list.toString());
        System.out.println(list.toString()); 
    }
    private static void insertEnd(List<Integer> list, int N){   

        for(int i = 0; i<N;i++){
        int randomInt = (int)(2*(Math.random()*N));
        list.add(list.size(), randomInt);
        }
        System.out.println(list.toString());    
    }
    private static void insertRandom(List<Integer> list, int N){
        for(int i = 0; i<N;i++){
        int randomLocation = (int)(Math.random()*(list.size()-1));
        int randomInt = (int)(2*(Math.random()*N));
        list.add(randomLocation, randomInt);
        }
        System.out.println(list.toString()); 
    }
    private static void removeStart(List<Integer> list, int N){
        list.remove(0);
        System.out.println(list.toString()); 
    }
    private static void removeEnd(List<Integer> list, int N){
        list.remove(list.size()-1);
        System.out.println(list.toString());
    }
    private static void removeRandom(List<Integer> list, int N){
        int randomLocation = (int)(Math.random()*(list.size()));
        list.remove(randomLocation);
        System.out.println(list.toString());      
    }
    private static void removeByValue(List<Integer> list, int N){
        int randomInt = (int)(2*(Math.random()*N));
        list.remove((Object)randomInt);
        System.out.println(list.toString());
    }    
    
}
