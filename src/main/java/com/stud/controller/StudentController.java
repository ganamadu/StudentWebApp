package com.stud.controller;

import com.stud.core.Student;
import com.stud.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stud")
public class StudentController {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;


    @PostMapping
    public Student save(@RequestBody Student  student) {
        LOGGER.info("Controller: Called the save Student method....");
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        LOGGER.info("Controller: Called the getStudents List method....");
        return studentService.getStudents();
    }

    @GetMapping("/{sno}")
    public Student getStudentById(@PathVariable Integer sno) {
        LOGGER.info("Controller: Called the getStudentById method....");
        return studentService.getStudentById(sno);
    }

}
