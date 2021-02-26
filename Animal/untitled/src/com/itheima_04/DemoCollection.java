package com.itheima_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        Student s = new Student("里",12);
        Student s1 = new Student("留",45);

        c.add(s);
        c.add(s1);

        Iterator<Student> iterator = c.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.getAge()+" "+next.getName());
        }
    }
}
