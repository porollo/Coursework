package com.porollo.courcework.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * Created by Dmitriy S. Porollo on 24.11.2015.
 */

public class ArrayDequeExample {

    public static void main(String[] args) {
        //Создание экземпляра ArrayDeque
        ArrayDeque<String> arrayDeque= new ArrayDeque<>();

        arrayDeque.add("A");
        arrayDeque.add("B");
        arrayDeque.add("C");
        arrayDeque.add("D");
        arrayDeque.add("E");

        //Добавление "D" в начало очереди
        arrayDeque.offerFirst("Q");

        //Добавление "E" в конец очереди
        arrayDeque.offerLast("X");

        System.out.println("ArrayDeque: ");
        // Итерируемся и выводим
        Iterator<String> itr= arrayDeque.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
