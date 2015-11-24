package com.porollo.courcework.Collection.List;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by Dmitriy S. Porollo on 24.11.2015.
 */

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        //Добавление элементов в стек
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");

        // Вывод содержимого стека
        System.out.println("Stack before reverse = " + stack);

        // Меняем порядок коллекции
        Collections.reverse(stack);

        System.out.println("After reverse Vector = " + stack);

    }

}
