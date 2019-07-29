package edu.hauphvn.fa;

import edu.hauphvn.fa.model.Student;

import java.util.*;

public class ComparableSample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("student1",123));
        studentList.add(new Student("student5",1244));
        studentList.add(new Student("student3",125));
        Collections.sort(studentList,new StudentComparator());
        System.out.println(studentList);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("a", 1));
        studentSet.add(new Student("c", 3));
        studentSet.add(new Student("b", 2));

        Iterator<Student> itr = studentSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
