package waa.green.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.green.model.Student;
import waa.green.repository.StudentRepository;
import waa.green.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student getStudentByCode(String code) {
        return studentRepository.getByCodeBarcode(code);
    }

    @Override
    public Student getStudentByFirstNameAndLastName(String firstName, String lastName) {
        return studentRepository.getStudentByFirstNameAndLastName(firstName,lastName);
    }

}
