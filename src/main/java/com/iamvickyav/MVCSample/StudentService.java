package com.iamvickyav.MVCSample;

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
            Student s1 = new Student(1, "Vicky", Gender.MALE, new Date(1992, 8, 30));
            Student s2 = new Student(2, "Keerthu", Gender.FEMALE, new Date(1993, 2, 23));
            Student s3 = new Student(3, "Sathish", Gender.MALE, new Date(1993, 1, 31));
            Student s4 = new Student(4, "Dhivakar", Gender.MALE, new Date(1993, 2, 9));
            Student s5 = new Student(5, "Praveen", Gender.MALE, new Date(1993, 3, 7));

            map.put(s1.id, s1);
            map.put(s2.id, s2);
            map.put(s3.id, s3);
            map.put(s4.id, s4);
            map.put(s5.id, s5);
        }
    }
}
