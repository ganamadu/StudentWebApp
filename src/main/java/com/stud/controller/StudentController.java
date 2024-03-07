package com.stud.controller;

import com.stud.core.Student;
import com.stud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stud")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping
    public Student save(@RequestBody Student  student) {
        System.out.println("Controller: Called the save Student method....");
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        System.out.println("Controller: Called the getStudents List method....");
        return studentService.getStudents();
    }

    @GetMapping("/{sno}")
    public Student getStudentById(@PathVariable Integer sno) {
        System.out.println("Controller: Called the getStudentById method....");
        return studentService.getStudentById(sno);
    }

}
