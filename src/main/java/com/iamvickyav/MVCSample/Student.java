package com.iamvickyav.MVCSample;

import java.util.Date;

public class Student {
    public Integer id;
    public String name;
    public Gender gender;
    public Date dob;
    public String title;

    public Student(Integer id, String name, Gender gender, Date dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        if(this.gender == Gender.MALE)
            this.title = "Mr";
        else
            this.title = "Ms";
    }
}
