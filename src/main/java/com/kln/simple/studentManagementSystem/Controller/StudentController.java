package com.kln.simple.studentManagementSystem.Controller;

import com.kln.simple.studentManagementSystem.Model.Student;

public class StudentController {
    public Student get() throws IllegalArgumentException{
        Student student = new Student();
        student.setName("nishan");
        student.setAge(23);
        return student;
    }
}
