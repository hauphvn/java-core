package edu.hauphvn.fa.model;

public class Teacher implements Comparable<Teacher>{
    private String name;
    private int code;


    public Teacher(String name, int code){
        this.name = name;
        this.code = code;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return name + " -- " + code;
    }

    @Override
    public int compareTo(Teacher student) {
//        return this.name.compareTo(student.getName());
        return Integer.valueOf(this.getCode()).compareTo(student.getCode());
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Teacher){
            Teacher student = (Teacher)o;
            return this.name.equals(student.getName()) && this.code == student.getCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.code;
    }
}
