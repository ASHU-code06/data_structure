package com.dataStructure;
import java.util.LinkedList;
import java.util.Queue;
public class MakingAQu {
    public static void main(String[] args){
        Queue<Integer> c = new LinkedList<>();
        c.offer(56);
        c.offer(30);
        c.offer(70);
        System.out.println("Elements are :  "+c);
        c.poll();
        System.out.println("After polling 1 time Elements are :  "+c);
    }
}
