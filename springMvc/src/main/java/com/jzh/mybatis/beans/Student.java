package com.jzh.mybatis.beans;

public class Student {

    private long id;

    private String name;

    private int age;

    private String remaerk;

    public Student() {
    }

    public Student(long id, String name, int age, String remaerk) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.remaerk = remaerk;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRemaerk() {
        return remaerk;
    }

    public void setRemaerk(String remaerk) {
        this.remaerk = remaerk;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", remaerk='" + remaerk + '\'' +
                '}';
    }
}
