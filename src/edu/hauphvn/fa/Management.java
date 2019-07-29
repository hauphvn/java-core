package edu.hauphvn.fa;

import edu.hauphvn.fa.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Management {

    public <T> void manage(List<T> list, T obj){
        if(list == null){
            return;
        }
        list.add(obj);
    }
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Management managementStudent = new Management();
        managementStudent.manage(studentList, new Student("hauphvn", 125));
        managementStudent.manage(studentList, new Student("hauphvn1", 18));
        managementStudent.manage(studentList, new Student("hauphvn3", 12));
        Collections.sort(studentList);
        System.out.println(studentList);
    }
}
