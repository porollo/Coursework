package com.porollo.courcework.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class TreeMapExample {

    public static void main(String[] args) {

        //Создание нового объекта TreeMap
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        //Добавление ключей и значений
        treeMap.put(1, "cat"); //
        treeMap.put(2, "dog");
        treeMap.put(3, "pig");
        treeMap.put(4, "horse");
        treeMap.put(5, "elephant");

        //Возвращаем набор ключей и значений
        Set<Integer> keys = treeMap.keySet();

        for (Integer key : keys) {
            System.out.println(" key = " + key + " value =" + treeMap.get(key));

        }
    }
}
