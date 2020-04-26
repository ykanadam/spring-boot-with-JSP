package com.iamvickyav.MVCSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student")
    ModelAndView dispStudent(@RequestParam("id") Integer id){

        Student student = studentService.getStudent(id);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", student.title);
        modelAndView.addObject("name", student.name);

        modelAndView.setViewName("student");
        return modelAndView;
    }


    @RequestMapping(value = "/student/detail")
    ModelAndView dispStudentDetail(@RequestParam("id") Integer id){

        Student student = studentService.getStudent(id);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student", student);
        modelAndView.setViewName("student2");
        return modelAndView;
    }

    @RequestMapping("/student/all")
    ModelAndView dispAllStudents(){

        List<Student> studentList = studentService.getStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", studentList);
        modelAndView.setViewName("all");
        return modelAndView;
    }
}
