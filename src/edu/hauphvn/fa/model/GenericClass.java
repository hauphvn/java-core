package edu.hauphvn.fa.model;

import edu.hauphvn.fa.DataAccess;

public class GenericClass {

    public static void main(String[] args) {
        DataAccess<Student> studentDataAccess = new DataAccess<>();
        Student student = new Student("hau", 123);
        studentDataAccess.save(student);
    }
}
