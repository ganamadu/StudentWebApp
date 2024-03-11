package com.stud.service;

import com.stud.core.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(StudentService.class);

    public Student save(Student student) {
        LOGGER.info("Service: Called the save Student method....");
        student.setSno(1);
        return student;
    }

    public List<Student> getStudents() {
        LOGGER.info("Service: Called the getStudents List method....");
        List<Student> studList = new ArrayList<>(   );
        Student stud = new Student();
        stud.setSno(1);
        stud.setSname("Ganapathi");;
        stud.setAge(40);
        studList.add(stud);
        stud = new Student();
        stud.setSno(2);
        stud.setSname("Thaneesh");;
        stud.setAge(10);
        studList.add(stud);
        stud = new Student();
        stud.setSno(3);
        stud.setSname("Rishith");;
        stud.setAge(7);
        studList.add(stud);
        return studList;
    }

    public Student getStudentById(Integer sno) {
        LOGGER.info("Service: Called the getStudentById method....");
        Student stud = new Student();
        stud.setSno(sno);
        stud.setSname("Ganapathi");;
        stud.setAge(40);
        return stud;
    }

}
