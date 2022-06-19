package com.Arraylist.fisrt;

import java.util.ArrayList;
import java.util.List;

public class AccesingElement {
    public static void main(String[] args) {
        List<String> topProgrammingLanguage = new ArrayList<>();
        // check if Arraylist is Empty using isEmpty

        System.out.println("is top programming language is Empty : "+topProgrammingLanguage.isEmpty());
         topProgrammingLanguage.add("Java");
        topProgrammingLanguage.add("C#");
        topProgrammingLanguage.add("C++");
        topProgrammingLanguage.add("C");
        topProgrammingLanguage.add("Python");
        System.out.println("top programming is "+topProgrammingLanguage.size()+" langauge in the world");

        // retrieve  element with index
        String bestProgrmming = topProgrammingLanguage.get(1);
        System.out.println(bestProgrmming);
    }

}
