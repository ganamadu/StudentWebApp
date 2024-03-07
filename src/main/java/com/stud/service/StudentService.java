package com.stud.service;

import com.stud.core.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public Student save(Student student) {
        System.out.println("Service: Called the save Student method....");
        student.setSno(1);
        return student;
    }

    public List<Student> getStudents() {
        System.out.println("Service: Called the getStudents List method....");
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
        System.out.println("Service: Called the getStudentById method....");
        Student stud = new Student();
        stud.setSno(sno);
        stud.setSname("Ganapathi");;
        stud.setAge(40);
        return stud;
    }

}
