package edu.hauphvn.fa;

import edu.hauphvn.fa.model.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Duplication {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("a", 1));
        studentSet.add(new Student("c", 3));
        studentSet.add(new Student("b", 4));
        studentSet.add(new Student("b", 6));


        System.out.println(studentSet);
        Iterator<Student> itr = studentSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
