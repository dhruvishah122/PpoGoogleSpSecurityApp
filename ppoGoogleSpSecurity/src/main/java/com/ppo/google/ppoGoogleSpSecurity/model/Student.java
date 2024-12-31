package com.ppo.google.ppoGoogleSpSecurity.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Student {

    private int id;
    private String name;
    private int marks;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(int id, String name, int marks) {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
}
