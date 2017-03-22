/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Name
 */
public class BigO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigO bigO = new BigO();
        int size = 5000000;
        System.out.println("--------------------5000000-------------------");
        ArrayList<Integer> array = bigO.createArray(size);
        System.out.println("--------------------Big O ArrayList-------------------");
        bigO.bigOForList(array);
        LinkedList<Integer> linked = bigO.createLinkedList(size);
        System.out.println("--------------------Big O LinkedList-------------------");
        bigO.bigOForList(linked);
        size = 10000000;
        System.out.println("--------------------10000000-------------------");
        array = bigO.createArray(size);
        System.out.println("--------------------Big O ArrayList-------------------");
        bigO.bigOForList(array);
        linked = bigO.createLinkedList(size);
        System.out.println("--------------------Big O LinkedList-------------------");
        bigO.bigOForList(linked);
        array = null;
        linked = null;
        size = 20000000;
        System.out.println("--------------------20000000-------------------");
        array = bigO.createArray(size);
        System.out.println("--------------------Big O ArrayList-------------------");
        bigO.bigOForList(array);
        linked = bigO.createLinkedList(size);
        System.out.println("--------------------Big O LinkedList-------------------");
        bigO.bigOForList(linked);
        array = null;
        linked = null;
        size = 40000000;
        System.out.println("--------------------40000000-------------------");
        array = bigO.createArray(size);
        System.out.println("--------------------Big O ArrayList-------------------");
        bigO.bigOForList(array);
        linked = bigO.createLinkedList(size);
        System.out.println("--------------------Big O LinkedList-------------------");
        bigO.bigOForList(linked);
    }
    
    public ArrayList<Integer> createArray(int size){
        ArrayList<Integer> theArray = new ArrayList<>(size);
        Long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            theArray.add(i, i);
            //System.out.println("Time to add "+i+":"+(System.currentTimeMillis()-start));
            start = System.currentTimeMillis();
        }
        return theArray;
    }
    
    public void bigOForList(List<Integer> array){
        Long start = System.currentTimeMillis();
        array.get(1);
        System.out.println("Time to get "+1+":"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        array.get(array.size()/2);
        System.out.println("Time to get "+(array.size()/2)+":"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        array.get(array.size()-1);
        System.out.println("Time to get "+(array.size())+":"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        array.remove(0);
        System.out.println("Time to remove "+0+":"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        array.remove(array.size()/2);
        System.out.println("Time to remove "+(array.size()/2)+":"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        array.remove(array.size()-1);
        System.out.println("Time to remove "+(array.size())+":"+(System.currentTimeMillis()-start));
    }
    
    public LinkedList<Integer> createLinkedList(int size){
        LinkedList<Integer> theLinkedList = new LinkedList<>();
        Long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            theLinkedList.add(i);
            //System.out.println("Time to add "+i+":"+(System.currentTimeMillis()-start));
            start = System.currentTimeMillis();
        }
        return theLinkedList;
    }
    
    
}
