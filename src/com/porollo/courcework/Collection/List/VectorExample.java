package com.porollo.courcework.Collection.List;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        //Добавление элементов в вектор
        vector.add(0);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        //Возвращаем итератор
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println("Vector element is = " + iterator.next());

        }

    }

}