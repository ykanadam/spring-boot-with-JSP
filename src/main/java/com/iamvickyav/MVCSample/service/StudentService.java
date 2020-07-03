package com.iamvickyav.MVCSample.service;

import com.iamvickyav.MVCSample.model.Gender;
import com.iamvickyav.MVCSample.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    Map<Integer, Student> map = new HashMap<>();

    public Student getStudent(Integer id){
        prepareMap();
        return map.get(id);
    }

    public List<Student> getStudents(){
        prepareMap();

        Set<Integer> keySet = map.keySet();
        List<Student> students = new ArrayList<>();
        for(Integer key: keySet) {
            students.add(map.get(key));
        }
        return students;
    }

    private void prepareMap() {
        if(map.isEmpty()) {
            Student s1 = new Student(1, "Vicky", Gender.MALE);
            Student s2 = new Student(2, "Keerthu", Gender.FEMALE);
            Student s3 = new Student(3, "Sathish", Gender.MALE);
            Student s4 = new Student(4, "Dhivakar", Gender.MALE);
            Student s5 = new Student(5, "Praveen", Gender.MALE);

            map.put(s1.id, s1);
            map.put(s2.id, s2);
            map.put(s3.id, s3);
            map.put(s4.id, s4);
            map.put(s5.id, s5);
        }
    }
}
