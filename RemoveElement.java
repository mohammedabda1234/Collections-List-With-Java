package com.Arraylist.fisrt;
// remove()
// removeAll()
//clear()
import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Gripe");

        System.out.println(fruits);
        fruits.remove(2);
        System.out.println("After remove");
        System.out.println(fruits);

        fruits.remove("Mango");
        System.out.println("After removing object");
        System.out.println(fruits);

        List<String> subFruits = new ArrayList<>();
        subFruits.add("Banana");
        subFruits.add("Gripe");
        fruits.removeAll(subFruits);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}
