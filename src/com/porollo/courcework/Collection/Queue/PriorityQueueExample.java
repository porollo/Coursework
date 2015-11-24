package com.porollo.courcework.Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Dmitriy S. Porollo on 24.11.2015.
 */

public class PriorityQueueExample {

    public static void main(String[] args) {

        // Создание экземпляра PriorityQueue
        PriorityQueue< Integer > priorityQueue = new PriorityQueue <> ();

        // Добавление элементов в очередь
        priorityQueue.add(5);
        priorityQueue.add(7);
        priorityQueue.add(5);
        priorityQueue.add(54);
        priorityQueue.add(7);

        System.out.println ( "Priority queue values: "+ priorityQueue);

        // Создание компаратора
        Comparator comparator = priorityQueue.comparator();

        System.out.println ( "Comparator value: "+ comparator);
    }
}
