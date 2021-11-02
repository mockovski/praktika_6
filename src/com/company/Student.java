package com.company;

public class Student implements Comparable<Student>
{
    String name;
    int id_num;
    int GPA;
    Student(String name, int id_num, int GPA)
    {
        this.GPA = GPA;
        this.name = name;
        this.id_num = id_num;
    }
    Student(String name, int id_num)
    {
        this.name = name;
        this.id_num = id_num;
    }
    public int compareTo(Student o) {
        return Integer.compare(this.id_num, o.id_num);
    }
}
