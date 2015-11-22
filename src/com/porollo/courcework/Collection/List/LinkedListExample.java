package com.porollo.courcework.Collection.List;

import java.util.*;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class LinkedListExample {

    public static void main(String[] args) {

        List<Integer> linkedListOne = new LinkedList<>(); // Создание первого листа
        List<Integer> linkedListTwo = new LinkedList<>(); // Создание второго листа

        for (int i = 0; i < 10; i ++){
            linkedListOne.add(i); // Добавление элементов 0-9 в первый лист
        }

        for (int y = 10; y < 20; y++) {
            linkedListTwo.add(y); // Добавление элементов 10-19 во второй лист
        }

        System.out.println("linkedListOne elements: " + linkedListOne.toString());
        // Вывод элементов первого листа
        System.out.println("linkedListTwo elements: " +linkedListTwo.toString());
        // Вывод элементов второго листа
        linkedListOne.addAll(linkedListTwo);
        // Добавление элементов второго листа
        System.out.println("linkedListOne elements: " + linkedListOne.toString());
        // Вывод первого листа с элементами второго
    }
}
