package com.porollo.courcework.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // Создание LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap();
        // Помещаем элементы в LinkedHashMap
        linkedHashMap.put("Dima",   new Integer(9995));
        linkedHashMap.put("Vasya",  new Integer(84));
        linkedHashMap.put("Gleb",   new Integer(-1344));
        linkedHashMap.put("Sergey", new Integer(85));
        linkedHashMap.put("Andrey", new Integer(61));
        // Поручение набора
        Set set = linkedHashMap.entrySet();
        // Создание итератора
        Iterator iterator = set.iterator();
        // Вывод элементов
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Добавление 1000 к Dima
        Integer newcount = linkedHashMap.get("Dima");
        linkedHashMap.put("Dima", new Integer(newcount + 1000));
        // Вывод результата
        System.out.println("Dima newcount: " +
                linkedHashMap.get("Dima"));
    }
}
