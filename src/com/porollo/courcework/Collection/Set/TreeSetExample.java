package com.porollo.courcework.Collection.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class TreeSetExample {


    public static void main(String[] args) {

        // Создание массива типа Integer
        Integer [] array={1, 3, 6, 12, 32, 43 ,54};

        //Выведем содержимое массива
        for (Integer integer : array) {
            System.out.println("Array elements is =" + integer);
        }

        //Создание TreeSet из элементов массива
        Set<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(array));
        System.out.println();

        // Вывод treeSet
        for (Integer integer : treeSet) {
            System.out.println("TreeSet Element = " + integer);
        }
    }



}
