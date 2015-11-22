package com.porollo.courcework.Collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class ArrayListExample {


    public static void main(String[] args) {


        List<String> arrayList = new ArrayList<>(20); //Создание ArrayList c емкостью 20

        arrayList.add("Null"); // Добавление String Null
        arrayList.add("One"); // Добавление String One
        arrayList.add("Two"); // Добавление String Two
        arrayList.add("Two for delete"); // Добавление String Two for delete
        arrayList.remove("Two for delete"); // Удаление String Two for delete


        System.out.println("ArrayList size " + arrayList.size()); // Вывод размера ArrayList

        for (int i = 0; i < arrayList.size(); i++ ) // Вывод элементов листа
            System.out.println(arrayList.get(i));

    }
}
