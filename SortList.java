package com.Arraylist.fisrt;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Employee>emp = new ArrayList<>();
        emp.add(new  Employee(23,"mohamed",25,40000));
        emp.add(new  Employee(2903,"Ali",25,67000));
        emp.add(new  Employee(23,"John",35,70000));
        emp.add(new  Employee(23,"Sarah",20,5000));


        Collections.sort(emp , new MySort());

        System.out.println(emp);
//        //create list
//        List<Integer>list = new ArrayList<>();
//        list.add(20);
//        list.add(10);
//        list.add(30);
//        list.add(50);
//        list.add(40);
//
//        //Sort in the list
//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.reverse(list);
//        System.out.println(list);


    }
}
class  MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}