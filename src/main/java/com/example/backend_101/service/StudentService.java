package com.example.backend_101.service;

import com.example.backend_101.model.Student;
import com.example.backend_101.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

//    public void trxLogic() {
//        // logic trx
//    }

    public Student addStudent(Student student) {
        student.setFaculty(student.getFaculty());
        student.setMajor(student.getMajor());
        student.setYearIn(student.getYearIn());
        studentRepository.save(student);
        return student;
    }



}
