package com.iamvickyav.MVCSample.model;

public class Student {
    public Integer id;
    public String name;
    public Gender gender;
    public String title;

    public Student(Integer id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        if(this.gender == Gender.MALE)
            this.title = "Mr";
        else
            this.title = "Ms";
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getTitle() {
        return title;
    }
}
