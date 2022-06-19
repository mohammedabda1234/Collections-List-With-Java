package com.Arraylist.fisrt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// use differen ways to create iterating in list
public class DifferceWaysToIterting {
    public static void main(String[] args) {
        List<String> course = Arrays.asList("C","Java","C++","Python","C#");

        for (int i = 0; i <course.size() ; i++) {
            System.out.println(course.get(i));

        }

        //enhance for each loop
        for (String cours: course) {
            System.out.println(cours);
        }

        // basic Iterator
        for (Iterator iterator = course.iterator();iterator.hasNext();){
            String courses = (String) iterator.next();
            System.out.println(courses);
        }
        // while loop
        Iterator<String> iterator = course.iterator();
        while (iterator.hasNext()){
            String courses = (String) iterator.next();
            System.out.println(courses);
        }
    }
}
