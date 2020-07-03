package com.iamvickyav.MVCSample.controller;

import com.iamvickyav.MVCSample.service.StudentService;
import com.iamvickyav.MVCSample.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student/{id}")
    ModelAndView dispStudent(@PathVariable("id") Integer id){

        Student student = studentService.getStudent(id);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", student.title);
        modelAndView.addObject("name", student.name);
        modelAndView.addObject("gender", student.gender);

        modelAndView.setViewName("student");
        return modelAndView;
    }

    @RequestMapping("/students")
    ModelAndView dispAllStudents(){

        List<Student> studentList = studentService.getStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", studentList);
        modelAndView.setViewName("all");
        return modelAndView;
    }
}
