package com.learnjava.concurent;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author luohaiyang
 * @Date 2022/4/7
 */
public class ReentrantLockDemo {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();

        System.out.println(reentrantLock.tryLock());
        List list ;
        Set set;
        ArrayList arrayList;
        LinkedList linkedList;

        HashSet hashSet;
        LinkedHashSet linkedHashSet;
        SortedSet set1;
        TreeSet treeSet;
        Vector vector;
        Stack stack;

        NavigableSet navigableSet;
        AbstractQueue abstractQueue;


        TreeMap treeMap;
        HashMap hashMap;
        LinkedHashMap linkedHashMap;
        Hashtable hashtable;
        SortedMap sortedMap;

        Collections.synchronizedMap(new HashMap<>());







    }
}
