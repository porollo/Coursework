package com.porollo.courcework.Map;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class HashMapExample {


    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap(20); //Создание экземпляра HashMap с емкостью 20.

        hashMap.put(0, "Null"); //Помещение пары ключ-значение int 0, String Null в HashMap
        hashMap.size(); //Узнаем размер HashMap
        hashMap.containsKey(0); //Проверка ключа 0 на наличие
        hashMap.containsValue("Null"); //Проверка значения "Null"

        for (Integer key : hashMap.keySet()) { //Выборка ключей
            System.out.println("Key: " + key);
        }

        for (String value : hashMap.values()) { //Выборка значений
            System.out.println("Value: " + value);
        }

        for (Map.Entry entry : hashMap.entrySet()) { // Выборка ключей и значений
            System.out.println("Key: " + entry.getKey() + " And" + " Value: "
                    + entry.getValue());
        }
    }
}
