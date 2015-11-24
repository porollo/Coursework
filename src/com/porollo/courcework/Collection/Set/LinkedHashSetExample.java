package com.porollo.courcework.Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();
        //Добавляем элементы в linkedHashSet
        linkedHashSet.add("Dima");
        linkedHashSet.add("Vasya");
        linkedHashSet.add("Gleb");
        linkedHashSet.add("Nick");
        linkedHashSet.add("Sergey");

        //Выводим linkedHashSet
        System.out.println("linkedHashSet is = " + linkedHashSet);

        //Создаем linkedHashSetNew
        LinkedHashSet<String> linkedHashSetNew = new LinkedHashSet<>();

        //Добавим элементы из linkedHashSet в linkedHashSetNew

        linkedHashSetNew.addAll(linkedHashSet);

        //Выводим linkedHashSetNew

        for (String str : linkedHashSetNew) {
            System.out.println("Element is = " + str);
        }

        System.out.println();
        //Удаляем элемент "Nick"
        linkedHashSetNew.remove("Nick");

        //Выводим linkedHashSetNew
        for (String str : linkedHashSetNew) {
            System.out.println("Element is = " + str);
        }


    }
}
