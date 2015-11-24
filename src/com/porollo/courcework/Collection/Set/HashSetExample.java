package com.porollo.courcework.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Dmitriy S. Porollo on 22.11.2015.
 */

public class HashSetExample {

    public static void main(String[] args) {

        //Создание экземпляра hashSet
        Set<Name> hashSet = new HashSet<>();

        //Добавление обьектов в hashSet
        hashSet.add(new Name("Dima",1234));
        hashSet.add(new Name("Sergey",9995));
        hashSet.add(new Name("Ivan", 4446));

        //Итерируемся по hashSet
        Iterator<Name> itr =hashSet.iterator();
        while (itr.hasNext()) {
            Name name = (Name) itr.next();
            System.out.println("Name = " + name.getName()+ " Id = " + name.getId());
        }
    }

    static class Name {

        //Обьявление переменных
        private String name;
        private int id;

        //Конструкторы

        public Name (String name, int id){
            super();
            this.name = name;
            this.id = id; }

        //Создание геттера getName
        public String getName(){
            return name;
        }
        //Создание сеттера setName
        public void setName(){
            this.name = name;
        }
        //Создание геттера getId
        public int getId(){
            return id;
        }
        //Создание сеттера setId
        public void setId(){
            this.id = id;
        }
    }
}
